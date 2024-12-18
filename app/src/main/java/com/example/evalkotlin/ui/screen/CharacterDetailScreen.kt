package com.example.evalkotlin.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import com.example.evalkotlin.data.model.Character

@Composable
fun CharacterDetailScreen(character: Character) {
    Column(modifier = Modifier.padding(16.dp)) {
//        Spacer(modifier = Modifier.height(16.dp))
        Text(text = character.name, style = MaterialTheme.typography.bodyLarge)
        Text(text = character.role, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = character.description, style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Abilities:", style = MaterialTheme.typography.labelLarge)
        character.abilities.forEach { ability ->
            Text(text = "${ability.name}: ${ability.description}", style = MaterialTheme.typography.bodyMedium)
        }
    }
}
