package com.example.evalkotlin.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.evalkotlin.data.model.Ability
import com.example.evalkotlin.data.model.Character

@Composable
fun CharacterCard(character: Character, onClick: (Character) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth() // Prend toute la largeur disponible
            .padding(8.dp)
            .clickable { onClick(character) },
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
//            // Ajout d'une image en haut de la carte
//            Image(
//                painter = rememberAsyncImagePainter(character.photoUrl),
//                contentDescription = "${character.name} image",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(150.dp) // Hauteur fixe pour les images
//            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = character.name,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = character.role,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
//
//@Preview
//@Composable
//fun CharacterCardPreview() {
//    val mockCharacter = Character(
//        id = 1,
//        name = "Phoenix",
//        role = "Duelist",
//        photoUrl = "https://example.com/phoenix.jpg",
//        description = "Phoenix is a fiery duelist with self-revive abilities.",
//        abilities = listOf(
//            Ability("Blaze", "Create a wall of fire."),
//            Ability("Curveball", "A flashbang that curves around corners.")
//        )
//    )
//    CharacterCard(character = mockCharacter, onClick = {})
//}
