function contagem(n) {
	// logica pra contar o numero de primos
	var contador = 0;
	for (let index = 0; index < n.length; index++) {
		if (n[index] % 1 == 0) {
			console.log(n[index]);
			contador++;
		}
	}

	return contador;
	console.log("A quantidade de numeros inteiros eh: " + contador);
}

module.exports = contagem;