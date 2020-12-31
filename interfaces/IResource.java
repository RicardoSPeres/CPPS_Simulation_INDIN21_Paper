/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libraries;

import jade.core.Agent;
import java.util.ArrayList;

/**
 *
 * @author Ricardo Silva Peres <ricardo.peres@uninova.pt>
 */
public interface IResource {
    public void init(Agent myAgent); 
    public String[] getSkills();
    public boolean executeSkill(String skillID);
}


/*

visionsensorHandle = sim.getObjectHandle('QualityInspection')
img = sim.getVisionSensorCharImage(visionsensorHandle)
imgPath = 'C:\\Users\\Ricardo Peres\\Desktop\\VisionDataset\\api\\product'..imgIndex..'.jpg'
sim.saveImage(img, {256,256}, 0, imgPath, 100)

 */