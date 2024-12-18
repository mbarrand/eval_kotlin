package com.example.evalkotlin.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.evalkotlin.data.model.Character
import com.example.evalkotlin.ui.composables.CharacterCard

@Composable
fun CharacterListScreen(characters: List<Character>, onCharacterClick: (Character) -> Unit) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp) // Ajout d'espace entre les lignes
    ) {
        items(characters.chunked(2)) { chunk ->
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp) // Espacement horizontal entre les cartes
            ) {
                chunk.forEach { character ->
                    Box(
                        modifier = Modifier
                            .weight(1f) // Prendre une part égale de la largeur
                    ) {
                        CharacterCard(character = character, onClick = onCharacterClick)
                    }
                }
                // Remplir l'espace vide si un seul élément dans la ligne
                if (chunk.size < 2) {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}
