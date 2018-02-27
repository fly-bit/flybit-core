package org.flybit.entity;

import javax.persistence.*;


@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SuppressWarnings("serial")
public abstract class BaseEntity<T extends org.flybit.entity.Entity> implements org.flybit.entity.Entity {

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    @Override
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    
    
}
