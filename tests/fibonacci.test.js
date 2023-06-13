const { describe } = require('yargs');
const fibonacci = require('../js/Fibonacci');

test('Os primeiros números da sequência de Fibonacci devem estar corretos', () => {
  expect(fibonacci(10)).toEqual([0, 1, 1, 2, 3, 5, 8, 13, 21, 34]);
});

test('Os dois primeiros números da sequência de Fibonacci devem ser 0 e 1', () => {
  expect(fibonacci(2)).toEqual([0, 1]);
});

