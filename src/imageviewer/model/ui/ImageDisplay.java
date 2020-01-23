/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.model.ui;

import imageviewer.model.Image;

/**
 *
 * @author Luicko
 */
public interface ImageDisplay {
    
    Image currentImage();
    void display(Image image);
}
