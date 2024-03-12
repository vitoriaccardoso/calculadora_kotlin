package br.senai.sp.jandira.calculadora

import android.os.Bundle
import android.print.PrintAttributes.Margins
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadora.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Teste()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Surface (
        modifier = Modifier.fillMaxSize(),
    ){
    Column{

        Card(

            modifier = Modifier
                .size(height = 180.dp, width = 500.dp)
                .padding(0.dp),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color(0xFFEED145B)
                ),


        )


        {
            Image(painter = painterResource(id = R.drawable.balanca), contentDescription = "Foto de Perfil",
                modifier = Modifier
                    .size(height = 60.dp, width = 360.dp)
                    .offset(y = 20.dp),

            )
            Text(text = "Calculadora IMC",
                modifier = Modifier
                    .padding(top = 25.dp, start = 100.dp),
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                    )



        }
        Spacer(modifier = Modifier.height(45.dp))
        Card (

            modifier = Modifier
                .width(350.dp)
                .height(450.dp)
                .padding(start = 45.dp)
                .offset(y = -90.dp)
                .align(Alignment.Start),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFECEFF0))
        ) {
            Column (
                modifier = Modifier.padding(5.dp)
            ){
                Text(text = "Seus dados",
                    modifier = Modifier
                        .padding(20.dp)
                        .align(Alignment.CenterHorizontally),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFE61753)

                    )


                Text(
                    text = "Seu peso: ",
                    modifier = Modifier.padding(12.dp),
                    color = Color(0xFFE61753),
                    fontWeight = FontWeight.Bold)



                OutlinedTextField(
                    modifier = Modifier.padding(10.dp),
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(10.dp),
                    placeholder = {
                        Text(text = "Seu Peso em kg")
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White,
                            unfocusedBorderColor = Color(0xFFE61753),
                            focusedBorderColor = Color(0xFFE61753),
                            unfocusedPlaceholderColor = Color.Gray,
                        )

                )

                Text(text = "Sua altura: ",
                    modifier = Modifier.padding(12.dp),
                    color = Color(0xFFE61753),
                    fontWeight = FontWeight.Bold)

                OutlinedTextField(
                    modifier = Modifier.padding(10.dp),
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(10.dp),
                    placeholder = {

                        Text(text = "Sua altura em cm")
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White,
                            unfocusedBorderColor = Color(0xFFE61753),
                            focusedBorderColor = Color(0xFFE61753),
                            unfocusedPlaceholderColor = Color.Gray,
                        )
                )

                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color(0xFFE61753)),
                    modifier = Modifier
                        .padding(16.dp)
                        .height(50.dp)
                        .width(280.dp)
                        .align(Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp)  ){
                        Text(
                            text = "CALCULAR",
                            fontSize = 18.sp,
                            letterSpacing = 1.sp
                        )





                }




            }

        }


        Card (
            modifier = Modifier
                .width(350.dp)
                .height(100.dp)
                .padding(start = 30.dp).align(Alignment.Start)
                .offset(y = -50.dp),
            colors = CardDefaults.cardColors(Color(0xff329F6B)),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        )
        {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp),
            )
            {
                Column(
                    modifier = Modifier
                        .padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Resultado",
                        fontSize = 16.sp,
                        color = Color(0xFFFFFFFF),
                    )
                    Text(
                        text = "Peso Ideal",
                        fontSize = 23.sp,
                        color = Color(0xFFFFFFFF),
                    )
                }
                Spacer(modifier = Modifier.width(40.dp))
                Text(
                    text = "21.3",
                    fontSize = 45.sp,
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                )
            }
        }

    }





        }



    }






@Composable
fun Teste() {
    Surface(




    ) {

        }

    }

            @Preview(showBackground = true, showSystemUi = true)
            @Composable
            fun GreetingPreview() {
                CalculadoraTheme {
                    Greeting()
                }
            }




