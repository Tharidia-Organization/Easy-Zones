# Tharidia Things - Zone Music System

This is a standalone module extracted from the main Tharidia Things mod.

## Description

Custom zone-based music system that plays specific music tracks in defined areas. Allows server administrators to define custom music zones and stream audio files to players within those zones.

## Features

- Zone-based music playback
- Server-controlled music streaming
- Custom music file support
- Automatic zone detection and playback

## Building

```bash
./gradlew build
```

The compiled JAR will be in `build/libs/`

## Installation

1. Install NeoForge 21.1+ for Minecraft 1.21.1
2. Place the JAR file in your `mods` folder
3. Launch the game

## Technical Details

**Packages included:**
- `com.THproject.tharidia_things.client` - Client-side music player
- `com.THproject.tharidia_things.network` - Network packets for zone music

**Key Classes:**
- `ZoneMusicPlayer` - Handles client-side music playback
- `ZoneMusicPacket` - Network packet for music data
- `ServerMusicFileHandler` - Server-side music file management

## Credits

Part of the Tharidia Things mod by THproject
