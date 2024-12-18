package com.example.evalkotlin.data.repository

import com.example.evalkotlin.data.model.Character
import com.example.evalkotlin.data.model.Ability

object CharacterRepository {
    fun getMockedCharacters(): List<Character> {
        return listOf(
            Character(
                id = 1,
                name = "Phoenix",
                role = "Duelist",
                photoUrl = "https://example.com/phoenix.jpg",
                description = "A fiery duelist who excels in combat.",
                abilities = listOf(
                    Ability("Blaze", "Create a wall of fire that blocks vision and heals Phoenix."),
                    Ability("Curveball", "Flashbang that curves around corners."),
                    Ability("Hot Hands", "Throw a fireball that damages enemies and heals Phoenix."),
                    Ability("Run It Back", "Mark your current location. If you die during the ability's duration, you respawn at the marked location.")
                )
            ),
            Character(
                id = 2,
                name = "Sage",
                role = "Sentinel",
                photoUrl = "https://example.com/sage.jpg",
                description = "A healer and support character who can resurrect teammates.",
                abilities = listOf(
                    Ability("Barrier Orb", "Place a solid wall that blocks movement and vision."),
                    Ability("Slow Orb", "Create a field that slows down players and muffles their movement."),
                    Ability("Healing Orb", "Heal yourself or teammates with a healing orb."),
                    Ability("Resurrection", "Revive a dead teammate.")
                )
            ),
            Character(
                id = 3,
                name = "Gekko",
                role = "Initiator",
                photoUrl = "https://example.com/gekko.jpg",
                description = "Gekko the Angeleno leads a tight-knit crew of calamitous creatures.",
                abilities = listOf(
                    Ability("Wingman", "Send Wingman forward to scout or plant/defuse the Spike."),
                    Ability("Dizzy", "Send Dizzy soaring forward to blind enemies."),
                    Ability("Mosh Pit", "Throw Mosh like a grenade that explodes on landing."),
                    Ability("Thrash", "Control Thrash to lash out and detain enemies in its radius.")
                )
            ),
            Character(
                id = 4,
                name = "Jett",
                role = "Duelist",
                photoUrl = "https://example.com/jett.jpg",
                description = "An agile duelist who excels in quick movement and sharp attacks.",
                abilities = listOf(
                    Ability("Cloudburst", "Throw a smoke cloud that obscures vision."),
                    Ability("Updraft", "Launch yourself into the air."),
                    Ability("Tailwind", "Dash a short distance in the direction you're moving."),
                    Ability("Blade Storm", "Equip a set of deadly throwing knives.")
                )
            ),
            Character(
                id = 5,
                name = "Sova",
                role = "Initiator",
                photoUrl = "https://example.com/sova.jpg",
                description = "A recon specialist who uses his bow to gather information.",
                abilities = listOf(
                    Ability("Shock Bolt", "Fire an explosive bolt that deals damage."),
                    Ability("Recon Bolt", "Fire a bolt that reveals enemies in its line of sight."),
                    Ability("Owl Drone", "Control a drone to scout and mark enemies."),
                    Ability("Hunter's Fury", "Fire energy blasts that deal damage and reveal enemies.")
                )
            ),
            Character(
                id = 6,
                name = "Cypher",
                role = "Sentinel",
                photoUrl = "https://example.com/cypher.jpg",
                description = "A spy expert who gathers intelligence and controls the battlefield.",
                abilities = listOf(
                    Ability("Trapwire", "Place a tripwire that tethers and reveals enemies."),
                    Ability("Cyber Cage", "Create a zone that slows enemies and blocks vision."),
                    Ability("Spycam", "Place a camera to monitor an area and mark enemies."),
                    Ability("Neural Theft", "Reveal the location of all enemies after killing one.")
                )
            ),
            Character(
                id = 7,
                name = "Raze",
                role = "Duelist",
                photoUrl = "https://example.com/raze.jpg",
                description = "An explosive duelist who loves to cause chaos.",
                abilities = listOf(
                    Ability("Boom Bot", "Deploy a robot that chases enemies and explodes."),
                    Ability("Blast Pack", "Throw a pack that sticks to surfaces and explodes."),
                    Ability("Paint Shells", "Throw a grenade that deals area damage."),
                    Ability("Showstopper", "Equip a rocket launcher to deal massive damage.")
                )
            ),
            Character(
                id = 8,
                name = "Killjoy",
                role = "Sentinel",
                photoUrl = "https://example.com/killjoy.jpg",
                description = "A tactical genius who uses gadgets to control the battlefield.",
                abilities = listOf(
                    Ability("Alarmbot", "Deploy a bot that hunts enemies and applies Vulnerable."),
                    Ability("Turret", "Deploy a turret that fires at enemies."),
                    Ability("Nanoswarm", "Throw a grenade that deals damage over time."),
                    Ability("Lockdown", "Deploy a device that detains all enemies in its radius.")
                )
            )
            // Ajoute plus de personnages si nécessaire
        )
    }
}
