package entity;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    private LocalDateTime writeTime;
    private LocalDateTime modifiedTime;

    public LocalDateTime getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(LocalDateTime writeTime) {
        this.writeTime = writeTime;
    }

    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
