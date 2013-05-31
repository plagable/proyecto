package com.unrc.app;

import com.unrc.app.models.Building;
import com.unrc.app.models.Ad;
import com.unrc.app.models.OwnerBuilding;

public class Anuncio {
//metodos insertar,modificar,eliminar anuncio

    public void insertar(String descriptive_text, int id_buildings, int id_ownersBuildings) {
        Building b = new Building();
        OwnerBuilding ob = new OwnerBuilding();
        Ad ad = new Ad();
        ad.set("descriptive_text", descriptive_text);
        ob = OwnerBuilding.findById(id_ownersBuildings);
        ad.set("id_ownersBuildings", ob.getId());
        b = b.findById(id_buildings);
        ad.set("id_buildings", b.getId());
        ad.saveIt();

    }
}
