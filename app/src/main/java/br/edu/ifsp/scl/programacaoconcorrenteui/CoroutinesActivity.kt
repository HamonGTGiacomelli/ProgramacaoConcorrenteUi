package br.edu.ifsp.scl.programacaoconcorrenteui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import kotlinx.coroutines.*

class CoroutinesActivity : ProgramacaoConcorrenteActivity() {

    override fun run() {

        CoroutineScope(Dispatchers.Main).launch {

            delay(Constantes.CARREGA_IMAGENS_DELAY);

            altaIv.setImageResource(R.drawable.android_preto)
            baixaIv.setImageResource(R.drawable.android_verde)
        }
    }


}
