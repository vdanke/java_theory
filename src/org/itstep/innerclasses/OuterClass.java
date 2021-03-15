package org.itstep.innerclasses;

import java.time.LocalDateTime;

public class OuterClass {

    private String state;
    private LocalDateTime updatedDate;
    private Memento memento;

    public OuterClass(String state, LocalDateTime updatedDate) {
        this.state = state;
        this.updatedDate = updatedDate;
        this.memento = new Memento(state, updatedDate);
    }

    public Memento getMemento() {
        return new Memento(this.state, this.updatedDate);
    }

    public void setMemento(Memento memento) {
        this.state = memento.state;
        this.updatedDate = memento.updatedDate;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public class Memento {

        private String state;
        private LocalDateTime updatedDate;

        public Memento(String state, LocalDateTime updatedDate) {
            this.state = state;
            this.updatedDate = updatedDate;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public LocalDateTime getUpdatedDate() {
            return updatedDate;
        }

        public void setUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
        }
    }
}
