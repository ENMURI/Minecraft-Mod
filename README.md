# Minecraft-Mod

dev notes:

instead of:
new Item(new Item.Properties().group(ItemGroup.MATERIALS)) 
use:
new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))

instead of:
AbstractBlock.Properties.create()
or
Block.Properties.create()
use:
Block.Properties.of()