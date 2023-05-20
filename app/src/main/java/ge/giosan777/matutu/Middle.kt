package ge.giosan777.matutu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import ge.giosan777.matutu.models.Person

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Middle() {

    val myList= listOf<Person>(Person(1,"599-06-87-21","GIORGI","KVARATSKHELIA"))
    Column(
        modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
            .background(Color.Cyan),

        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = { println(it) },
            label = { Text(stringResource(R.string.enter_phone_number)) },
            modifier = Modifier
                .height(60.dp)
                .width(220.dp),

            )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow)
        ) {
            itemsIndexed(
                myList
            ) { _, person ->
                ItemRow(person = person)
            }
        }
    }
}


@Composable
fun ItemRow(person: Person) {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(3.dp)
            .background(Color.White)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = person.firstName, fontStyle = FontStyle.Italic)
            Text(text = person.lastName)
            Text(text = person.phone)
        }
    }
}