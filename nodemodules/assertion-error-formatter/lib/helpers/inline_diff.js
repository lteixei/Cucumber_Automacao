'use strict';Object.defineProperty(exports, "__esModule", { value: true });exports.default =



inlineDiff;var _diff = require('diff');var _padRight = require('pad-right');var _padRight2 = _interopRequireDefault(_padRight);function _interopRequireDefault(obj) {return obj && obj.__esModule ? obj : { default: obj };}function inlineDiff(actual, expected, colorFns) {
  var msg = errorDiff(actual, expected, colorFns);

  // linenos
  var lines = msg.split('\n');
  if (lines.length > 4) {(function () {
      var width = String(lines.length).length;
      msg = lines.map(function (str, i) {
        return (0, _padRight2.default)(i + 1, width, ' ') + '|' + ' ' + str;
      }).join('\n');})();
  }

  // legend
  msg = '\n    ' +
  colorFns.diffRemoved('actual') +
  ' ' +
  colorFns.diffAdded('expected') +
  '\n\n' +
  msg.replace(/^/gm, '    ') +
  '\n';

  return msg;
}


function errorDiff(actual, expected, colorFns) {
  return (0, _diff.diffWordsWithSpace)(actual, expected).map(function (str) {
    if (str.added) {
      return colorFns.diffAdded(str.value);
    }
    if (str.removed) {
      return colorFns.diffRemoved(str.value);
    }
    return str.value;
  }).join('');
}