const primo = require('../js/numero-primo')

test('deve retornar primo', () => {
    expect(primo(5)).toEqual("primo")
})

test('deve retornar nao primo', () => {
    expect(primo(10)).toEqual("nao-primo")
});