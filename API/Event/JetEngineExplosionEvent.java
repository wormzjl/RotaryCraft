/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.API.Event;

import Reika.DragonAPI.Instantiable.Event.TileEntityEvent;
import Reika.RotaryCraft.TileEntities.Production.TileEntityEngine;

public class JetEngineExplosionEvent extends TileEntityEvent {

	public JetEngineExplosionEvent(TileEntityEngine te) {
		super(te);
	}

}
