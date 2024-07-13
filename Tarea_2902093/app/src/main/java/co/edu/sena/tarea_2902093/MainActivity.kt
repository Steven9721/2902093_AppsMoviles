package co.edu.sena.tarea_2902093

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.tarea_2902093.ui.theme.Tarea_2902093Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea_2902093Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Variables\n" +
                                "Es un espacio de memoria que se usa para almacenar datos que pueden cambiar durante la ejecución del programa. Las variables se declaran usando la palabra clave var.\n\n" +
                                "Constantes\n" +
                                "Es similar a una variable, pero su valor no puede cambiar después de ser inicializado. Las constantes se declaran usando la palabra clave val.\n\n"+
                                "Opcionales\n" +
                                "Se manejan mediante tipos que permiten nulos. Un tipo nullable se declara usando el signo de interrogación ? después del tipo.\n\n"+
                                "Nulos\n" +
                                "Representan la ausencia de un valor. En Kotlin, los tipos que permiten nulos deben manejarse cuidadosamente para evitar errores.\n\n"+
                                "README.MD\n"+
                                "Es un archivo de texto que se usa para proporcionar información sobre el proyecto. Generalmente se escribe en formato Markdown y puede incluir una descripción del proyecto.\n\n",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarea_2902093Theme {
        Greeting("Android")
    }
}