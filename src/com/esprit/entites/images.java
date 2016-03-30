
package com.esprit.entites;

/**
 *
 * @author megaplus
 */
public class images {
    private String ID;
    private String Name;
    private String Description;
    private byte[] Image;

    public images() {
    }

    public images(String ID, String Name, String Description, byte[] Image) {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.Image = Image;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] Image) {
        this.Image = Image;
    }

    
    
}
