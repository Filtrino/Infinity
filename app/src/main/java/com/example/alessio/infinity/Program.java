package com.example.alessio.infinity;

/**
 * Created by Alessio on 12/10/2017.
 */

public class Program  {
    String code, program ,skill , atk , opp  ,dmg , b , ammo ,duration , effect ;

    public Program(String code, String program, String skill, String atk, String opp, String dmg, String b, String ammo, String duration, String effect) {
        this.code = code;
        this.program = program;
        this.skill = skill;
        this.atk = atk;
        this.opp = opp;
        this.dmg = dmg;
        this.b = b;
        this.ammo = ammo;
        this.duration = duration;
        this.effect = effect;
    }

    public Program() {
        // public default constructor, which Firebase uses
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getOpp() {
        return opp;
    }

    public void setOpp(String opp) {
        this.opp = opp;
    }

    public String getDmg() {
        return dmg;
    }

    public void setDmg(String dmg) {
        this.dmg = dmg;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getAmmo() {
        return ammo;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}
