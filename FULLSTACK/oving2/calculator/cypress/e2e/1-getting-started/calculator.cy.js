/// <reference types="cypress" />

describe('Calculator', () => {
  beforeEach(() => {
    cy.visit('http://localhost:5173')
  })
  it('Should start empty, with no history', () => {
    cy.contains('Calculator').click()
    cy.get('#app')
      .children('.about')
      .children('.calculator')
      .children('.history')
      .should('contain', '')

    cy.get('#app')
      .children('.about')
      .children('.calculator')
      .children('.output')
      .children('.result')
      .should('contain', '0')
  })
})
