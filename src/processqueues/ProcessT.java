/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processqueues;

/**
 *
 * @author Geek-Programmer
 */
public class ProcessT {
    private String pid;
    private String name;
    private int priority;
    private String characters;
    private String charactersReplaced;
    private int currentQuantum;
    private int currentBurst;
    private int currentTurnaround;
    private int currentEndTime;
    
    private ProcessT next;//pointer to the next

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCharactersReplaced() {
        return charactersReplaced;
    }

    public void setCharactersReplaced(String charactersReplaced) {
        this.charactersReplaced = charactersReplaced;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public int getCurrentQuantum() {
        return currentQuantum;
    }

    public void setCurrentQuantum(int currentQuantum) {
        this.currentQuantum = currentQuantum;
    }

    public int getCurrentBurst() {
        return currentBurst;
    }

    public void setCurrentBurst(int currentBurst) {
        this.currentBurst = currentBurst;
    }

    public int getCurrentTurnaround() {
        return currentTurnaround;
    }

    public void setCurrentTurnaround(int currentTurnaround) {
        this.currentTurnaround = currentTurnaround;
    }

    public int getCurrentEndTime() {
        return currentEndTime;
    }

    public void setCurrentEndTime(int currentEndTime) {
        this.currentEndTime = currentEndTime;
    }

    public ProcessT getNext() {
        return next;
    }

    public void setNext(ProcessT next) {
        this.next = next;
    }

    public ProcessT() {
    }

    public ProcessT(String pid, String name, int priority, String characters, String charactersReplaced, int currentQuantum, int currentBurst, int currentTurnaround, int currentEndTime) {
        this.pid = pid;
        this.name = name;
        this.priority = priority;
        this.characters = characters;
        this.charactersReplaced = charactersReplaced;
        this.currentQuantum = currentQuantum;
        this.currentBurst = currentBurst;
        this.currentTurnaround = currentTurnaround;
        this.currentEndTime = currentEndTime;
    }

    @Override
    public String toString() {
        return "ProcessT{" + "pid=" + pid + ", name=" + name + ", priority=" + priority + ", characters=" + characters + ", charactersReplaced=" + charactersReplaced + ", currentQuantum=" + currentQuantum + ", currentBurst=" + currentBurst + ", currentTurnaround=" + currentTurnaround + ", currentEndTime=" + currentEndTime + ", next=" + next + '}';
    }
    
}
