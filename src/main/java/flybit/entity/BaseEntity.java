package flybit.entity;

import javax.persistence.*;


@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SuppressWarnings("serial")
public abstract class BaseEntity<T extends Entity> implements Entity{

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
