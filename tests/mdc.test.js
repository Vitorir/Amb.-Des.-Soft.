const mdc = require('../js/MDC')

test('deve retornar a qtd de inteiros', () => {
    expect(mdc(1, 2)).toEqual(1)
})

test('deve retornar a qtd de inteiros', () => {
    expect(mdc(5, 10)).toEqual(5)
})