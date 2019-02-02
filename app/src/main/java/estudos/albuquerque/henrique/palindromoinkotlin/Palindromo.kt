package estudos.albuquerque.henrique.palindromoinkotlin

class Palindromo constructor( conteudo: String) {
    val conteudo: String = conteudo
        get() {
            return field.toLowerCase() //Field é usado na customização do getter e setter
        }

    fun ehPalindromo(): Boolean {
        return conteudo == conteudo.reversed() // if (conteudo == conteudo.reversed())
    }
}