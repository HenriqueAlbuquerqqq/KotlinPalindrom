package estudos.albuquerque.henrique.palindromoinkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_palindrom.*

class PalindromActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_palindrom)


        btnTest.setOnClickListener{
            var typedPalin: String? = edtInsert.text.toString()
            var palind: Palindromo = Palindromo(typedPalin!!)
            if (palind.ehPalindromo())
                txtResult.text = "É um palindromo"
            else
                txtResult.text = "Não é um palindromo"
        }

    }

}
