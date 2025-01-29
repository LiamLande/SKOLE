/// <reference types="cypress" />

describe('Forms', () => {
  beforeEach(() => {
    cy.visit('http://localhost:5173')
  })
  it('submit button should not be clickable until form is valid', () => {
    cy.contains('Contact').click()
    cy.contains('Send').should('be.disabled')
  })
  it('submit button should be clickable and we should get success from json-server when form is sendt', () => {
    cy.contains('Contact').click()

    cy.stub(console, 'log').as('consoleLog')

    cy.get('#name').type('Cypress')
    cy.get('#email').type('test@email.com')
    cy.get('#message').type('This is a test message')
    cy.contains('Send').should('not.be.disabled').click()
    // cy.window()
    //   .then((win) => {
    //     cy.spy(win.console, 'log')
    //   })
    //   .get('spy')
    //   .contains('Success:')

    cy.get('@consoleLog').cy.should('contain', 'Success:')
  })
})
