package com.shakal.rpg.api.model.embedded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BagEquipmentId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4652175538284953555L;

	@Column(name = "bag_id")
    private Long bagId;

    @Column(name = "equipment_id")
    private Long equipmentId;

    public BagEquipmentId() {
    	
    }
    public BagEquipmentId(long bagId, long equipmentId) {
    	this.bagId = bagId;
    	this.equipmentId = equipmentId;
    }
	public Long getBagId() {
		return bagId;
	}
	public void setBagId(Long bagId) {
		this.bagId = bagId;
	}
	public Long getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(Long equipmentId) {
		this.equipmentId = equipmentId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bagId == null) ? 0 : bagId.hashCode());
		result = prime * result + ((equipmentId == null) ? 0 : equipmentId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BagEquipmentId other = (BagEquipmentId) obj;
		if (bagId == null) {
			if (other.bagId != null)
				return false;
		} else if (!bagId.equals(other.bagId))
			return false;
		if (equipmentId == null) {
			if (other.equipmentId != null)
				return false;
		} else if (!equipmentId.equals(other.equipmentId))
			return false;
		return true;
	}
    
    
}
