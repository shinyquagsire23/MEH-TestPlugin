package org.zzl.minegaming.TestPlugin;

import javax.swing.ImageIcon;

import org.zzl.minegaming.GBAUtils.GBARom;

public class Plugin extends org.zzl.minegaming.MEH.Plugin
{
	@Override
	public void load()
	{
		System.out.println("Hello, World!");
		setButtonImage(new ImageIcon(this.getClass().getResource("/resources/button.png")));
		setToolTip("Hello World Plugin v0.1");
	}
	
	@Override
	public void execute()
	{
		System.out.println("Executing!");
	}
	
	@Override
	public void loadROM(GBARom rom)
	{
		this.rom = rom;
		System.out.println("ROM " + rom.getGameCode() + " " + rom.getGameText() + " loaded!");
	}
	
	@Override
	public void loadMap(int map, int bank)
	{
		System.out.println("Map " + map + " bank " + bank + " loaded!");
	}
	
	@Override
	public void unload()
	{
		System.out.println("Exiting!");
	}
}
