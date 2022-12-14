package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class B extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("bacon\nbacteria\nbaker\nbakery\nbanana\nbanana bread\nbandage\nbank\nbarn\nbat\nbatter\nbattery\nbayonet\nbbq\nbeach\nbeaver\nbee\nbeehive\nbeekeeper\nbeer\nbell\nbicycle\nbig\nbinoculars\nbird\nbirdcage\nbirdhouse\nblack hole\nblade\nblender\nblizzard\nblood\nblood bag\nboat\nboiler\nbone\nbonsai tree\nbook\nbottle\nboulder\nbow\nbox\nbread\nbrick\nbridge\nbroom\nbucket\nbullet\nbulletproof vest\nbus\nbutcher\nbutter\nbutterfly\nbutterfly net");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String b = input.nextLine();
        switch(b) {
            case "bacon" -> Combination.bacon();
            case "bacteria" -> Combination.bacteria();
            case "baker" -> Combination.baker();
            case "bakery" -> Combination.bakery();
            case "banana" -> Combination.banana();
            case "banana bread" -> Combination.bananabread();
            case "bandage" -> Combination.bandage();
            case "bank" -> Combination.bank();
            case "barn" -> Combination.barn();
            case "bat" -> Combination.bat();
            case "batter" -> Combination.batter();
            case "battery" -> Combination.battery();
            case "bayonet" -> Combination.bayonet();
            case "bbq" -> Combination.bbq();
            case "beach" -> Combination.beach();
            case "beaver" -> Combination.beaver();
            case "bee" -> Combination.bee();
            case "beehive" -> Combination.beehive();
            case "beekeeper" -> Combination.beekeeper();
            case "beer" -> Combination.beer();
            case "bell" -> Combination.bell();
            case "bicycle" -> Combination.bicycle();
            case "big" -> Combination.big();
            case "binoculars" -> Combination.binoculars();
            case "bird" -> Combination.bird();
            case "birdcage" -> Combination.birdcage();
            case "birdhouse" -> Combination.birdhouse();
            case "black hole" -> Combination.blackhole();
            case "blade" -> Combination.blade();
            case "blender" -> Combination.blender();
            case "blizzard" -> Combination.blizzard();
            case "blood" -> Combination.blood();
            case "blood bag" -> Combination.bloodbag();
            case "boat" -> Combination.boat();
            case "boiler" -> Combination.boiler();
            case "bone" -> Combination.bone();
            case "bonsai tree" -> Combination.bonsaitree();
            case "book" ->Combination.book();
            case "bottle" -> Combination.bottle();
            case "boulder" -> Combination.boulder();
            case "bow" -> Combination.bow();
            case "box" -> Combination.box();
            case "bread" -> Combination.bread();
            case "brick" -> Combination.brick();
            case "bridge" -> Combination.bridge();
            case "broom" -> Combination.broom();
            case "bucket" -> Combination.bucket();
            case "bullet" -> Combination.bullet();
            case "bulletproof vest" -> Combination.bulletproofvest();
            case "bus" -> Combination.bus();
            case "butcher" -> Combination.butcher();
            case "butter" -> Combination.butter();
            case "butterfly" -> Combination.butterfly();
            case "butterfly net" -> Combination.butterflynet();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}