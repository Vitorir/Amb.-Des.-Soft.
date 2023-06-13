const quicksort = require('../js/quicksort');

test('deve retornar um vetor ordenado corretamente', ( ) => {
    expect(quicksort([1, 2, -4, 13, 3, 30])).toEqual([-4, 1, 2, 3, 13, 30])
});

test('deve retornar um vetor ordenado corretamente', ( ) => {
    expect(quicksort([5, 4, 3, 2, 1])).toEqual([1, 2, 3, 4, 5])
});