package com.bangbang.baseframe.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_media", schema = "bangbang")
public class MediaDO {
    private Long id;
    private Integer type;
    private Integer referType;
    private Long referId;
    private String address;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Column(name = "refer_type")
    public Integer getReferType() {
        return referType;
    }

    public void setReferType(Integer referType) {
        this.referType = referType;
    }

    @Column(name = "refer_id")
    public Long getReferId() {
        return referId;
    }

    public void setReferId(Long referId) {
        this.referId = referId;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaDO mediaDO = (MediaDO) o;
        return Objects.equals(id, mediaDO.id) &&
                Objects.equals(type, mediaDO.type) &&
                Objects.equals(referType, mediaDO.referType) &&
                Objects.equals(referId, mediaDO.referId) &&
                Objects.equals(address, mediaDO.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, referType, referId, address);
    }
}
