package br.edu.ifsp.scl.programacaoconcorrenteui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CoroutinesActivity : ProgramacaoConcorrenteActivity() {


    override fun run() {
        GlobalScope.launch {
            runOnUiThread {
                altaIv.setImageResource(R.drawable.android_preto)
                baixaIv.setImageResource(R.drawable.android_verde)
            }
        }
    }


}
