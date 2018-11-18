package co.miguelbravo.Amazonproyect.models;

import java.util.Date;

public interface IVisualizable {
 	Date startViewed (Date dateI);
 	void stopViewed (Date dateI, Date dateF);
}
