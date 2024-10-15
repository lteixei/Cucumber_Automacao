const { defineConfig } = require('cypress')

module.exports = defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
      // eventos ou plugins Cypress podem ser configurados aqui
      return config
    },
    specPattern: "cypress/e2e/**/*.cy.{js,jsx,ts,tsx}", // Mantém o padrão de arquivos de teste
    viewportWidth: 1024,
    viewportHeight: 768,
    defaultCommandTimeout: 10000,
    baseUrl: "https://cwi.com.br/"
  },
})

