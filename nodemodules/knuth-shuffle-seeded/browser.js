!function(e){if("object"==typeof exports&&"undefined"!=typeof module)module.exports=e();else if("function"==typeof define&&define.amd)define([],e);else{var f;"undefined"!=typeof window?f=window:"undefined"!=typeof global?f=global:"undefined"!=typeof self&&(f=self),f.shuffle=e()}}(function(){var define,module,exports;return (function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({1:[function(require,module,exports){
"use strict";var randGen=require("seed-random");module.exports=function(r,n){var e,o,t,a;if(a=null==n?randGen():randGen(n),r.constructor!==Array)throw new Error("Input is not an array");for(e=r.length;0!==e;)t=Math.floor(a()*e--),o=r[e],r[e]=r[t],r[t]=o;return r};
},{"seed-random":2}],2:[function(require,module,exports){
(function (global){
"use strict";function ARC4(t){var o,n=t.length,r=this,a=0,i=r.i=r.j=0,e=r.S=[];for(n||(t=[n++]);width>a;)e[a]=a++;for(a=0;width>a;a++)e[a]=e[i=mask&i+t[a%n]+(o=e[a])],e[i]=o;(r.g=function(t){for(var o,n=0,a=r.i,i=r.j,e=r.S;t--;)o=e[a=mask&a+1],n=n*width+e[mask&(e[a]=e[i=mask&i+o])+(e[i]=o)];return r.i=a,r.j=i,n})(width)}function flatten(t,o){var n,r=[],a=(typeof t)[0];if(o&&"o"==a)for(n in t)try{r.push(flatten(t[n],o-1))}catch(i){}return r.length?r:"s"==a?t:t+"\x00"}function mixkey(t,o){for(var n,r=t+"",a=0;a<r.length;)o[mask&a]=mask&(n^=19*o[mask&a])+r.charCodeAt(a++);return tostring(o)}function autoseed(t){try{return GLOBAL.crypto.getRandomValues(t=new Uint8Array(width)),tostring(t)}catch(o){return[+new Date,GLOBAL,GLOBAL.navigator&&GLOBAL.navigator.plugins,GLOBAL.screen,tostring(pool)]}}function tostring(t){return String.fromCharCode.apply(0,t)}var width=256,chunks=6,digits=52,pool=[],GLOBAL="undefined"==typeof global?window:global,startdenom=Math.pow(width,chunks),significance=Math.pow(2,digits),overflow=2*significance,mask=width-1,oldRandom=Math.random;module.exports=function(t,o){if(o&&o.global===!0)return o.global=!1,Math.random=module.exports(t,o),o.global=!0,Math.random;var n=o&&o.entropy||!1,r=[],a=(mixkey(flatten(n?[t,tostring(pool)]:0 in arguments?t:autoseed(),3),r),new ARC4(r));return mixkey(tostring(a.S),pool),function(){for(var t=a.g(chunks),o=startdenom,n=0;significance>t;)t=(t+n)*width,o*=width,n=a.g(1);for(;t>=overflow;)t/=2,o/=2,n>>>=1;return(t+n)/o}},module.exports.resetGlobal=function(){Math.random=oldRandom},mixkey(Math.random(),pool);


}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{}]},{},[1])(1)
});