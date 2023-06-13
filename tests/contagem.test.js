const contagem = require('../js/Contagem');

test('deve retornar a qtd de inteiros', () => {
    expect(contagem([1, 2, 3, 4, 5])).toEqual(5)
})
test('deve retornar a qtd de inteiros correta', () => {
    expect(contagem([1.5, 0.2, 30, -4, 5])).toEqual(3)
})