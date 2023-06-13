function primo(X) {
    var contador = 0;

    for (var i = 2; i < X; i++) {
        if (X % i === 0) {
            contador++;
            break;
        }
    }

    if (contador === 0) {
        console.log(X + " é primo");
        return "primo";
    } else {
        console.log(X + " não é primo");
        return "nao-primo";
    }
}

module.exports = primo;
