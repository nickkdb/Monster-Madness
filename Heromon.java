public class Heromon {
  public static void main(String[] args) {
    while (true) {
    System.out.println("WELCOME TO MONSTER MADNESS!");
    System.out.println();
    System.out.println("In this game, you'll try to bring your Hero to victory against a monster by attacking, defending, and using your items/ability.");
    System.out.println();
    System.out.println("Would you like to play the game? (Enter: YES or NO)");
    String ans= IO.readString();
    if ( ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("yes")) {
      if (ans.equalsIgnoreCase("no")) {
        System.out.println();
        System.out.println("Thanks for playing!");
        System.exit(0);
      }
      if (ans.equalsIgnoreCase("yes")) {
          System.out.println();
          playgame();
          System.out.println();
        }
    } else {
      System.out.println();
      System.out.println("INVALID ENTRY, TRY AGAIN!!!");
      System.out.println();
      }
    }
  }
  public static void playgame() {
  String choice;
  String looper;
  String special;
  int hp= 0;
  Monster Myers= new Monster();
  double myerhp= 0;
  Hero Bruiser= new Hero();
  Bruiser.HHealth= 500;
  double Bhp= 0;
  Bruiser.HWeapon= "Heavy Mace";
  Bruiser.HSwipe= 35;
  Bruiser.Heal= 60;
  Bruiser.Healcount= 3;
  Bruiser.specialcount= 4;
  Bruiser.Special= "Shield";
  Hero Swordfighter= new Hero();
  Swordfighter.HHealth= 425;
  double SFhp= 0;
  Swordfighter.HWeapon= "Knight's Sword";
  Swordfighter.HSwipe= 25;
  Swordfighter.Heal= 48;
  Swordfighter.Healcount= 4;
  Swordfighter.specialcount= 3;
  Swordfighter.Special= "Gunpowder Grenade";
  Hero Streetfighter= new Hero();
  Streetfighter.HHealth= 350;
  double STFhp= 0;
  Streetfighter.HWeapon= "Homemade Spear";
  Streetfighter.HSwipe= 20;
  Streetfighter.Heal= 50;
  Streetfighter.Healcount= 6;
  Streetfighter.specialcount= 1;
  Streetfighter.Special= "4 turn Taunt";
  System.out.println("To begin, choose your Hero!");
  System.out.println();
  while (true) {
  System.out.println("OPTION ONE: BRUISER        OPTION TWO: SWORDFIGHTER        OPTION THREE: STREETFIGHTER");
  System.out.println("***to select a Hero, enter their name! For a game guide along with each Hero's strengths/abilities, enter 'GUIDE'***");
  choice= IO.readString();
  if (choice.equalsIgnoreCase("BRUISER") || choice.equalsIgnoreCase("SWORDFIGHTER") || choice.equalsIgnoreCase("STREETFIGHTER") || choice.equalsIgnoreCase("GUIDE")) {
    if (choice.equalsIgnoreCase("GUIDE")) {
      System.out.println();
      System.out.println("Which hero you choose will alter your game experience, so choose wisely!");
      System.out.println();
      System.out.println("BREAKDOWN: Before each turn, you can use an item. Then, the hero and monster either attack, defend, or flee.");
      System.out.println("When attacking, your attack may or may not land. If it lands, it can land as a clean strike, or power hit.");
      System.out.println("When defending, an attack may be fully dodged, or partially dodged, which inflicts swipe damage.");
      System.out.println("You or the monster may flee before any turn. The monsters chance of fleeing varies throughout the fight.");
      System.out.println("Every Hero comes standard with two items: Armor, and heals. Your item stays equipped until used. (ex: won't lose equipped armor if you aren't attacked.)");
      System.out.println("Each of the Heroes have a unique special move or item that can help you win the fight vs the monster!");
      System.out.println("You can only use one item or special per turn, so manage your items wisely!");
      System.out.println("Along with their special, each Hero has different strengths on the battlefield, such as health attributes or accuracy.");
      System.out.println();
      System.out.println("BRUISER:");
      System.out.println("HEALTH: 500, DAMAGE: swipe= 35, clean strike= 90, power strike= 130, ITEMS: Heals(3x), Armor(1x), SPECIAL: Shield(2x)= When defending, dodge strike into counter attack of your own");
      System.out.println("the Bruiser is the powerhouse with high health and power, but it comes at the expense of accuracy and defense.");
      System.out.println();
      System.out.println("SWORDFIGHTER:");
      System.out.println("HEALTH: 425, DAMAGE: swipe= 25, clean strike= 70, power hit= 105, ITEMS: Heals(5x), Armor(1x), SPECIAL: Gunpowder Grenade(1x)= unblockable power strike");
      System.out.println("Swordfighter is the balanced hero, with middle-of-the-pack attacks and defense, but his triprope guarantees an easy strike at any time.");
      System.out.println();
      System.out.println("STREETFIGHTER:");
      System.out.println("HEALTH: 350, DAMAGE: swipe= 20, clean strike= 60, power hit= 90, ITEMS: Heals(7x), Armor(1x), SPECIAL: Taunt(1x, lasts 4 turns)= monster chance of fleeing increases 2x");
      System.out.println("Streetfighter doesn't have the health or power of his counterparts, but has stellar defense and can end fights early with his taunting.");
      System.out.println();
      System.out.println();
      continue;
          }
  if (choice.equalsIgnoreCase("BRUISER") || choice.equalsIgnoreCase("SWORDFIGHTER") || choice.equalsIgnoreCase("STREETFIGHTER")) {
    break;
    }
  } else {
    System.out.println();
    System.out.println("INVALID ENTRY, TRY AGAIN!!!");
  }
}
  if (choice.equalsIgnoreCase("BRUISER")) {
    hp += Bruiser.HHealth;
    special= "Shield(2x)";
    selector(Bruiser, choice, Myers, myerhp, Bhp);
  }
  if (choice.equalsIgnoreCase("SWORDFIGHTER")) {
    hp= 425;
    special= "trip rope";
    selector(Swordfighter, choice, Myers, myerhp, SFhp);
  }
  if (choice.equalsIgnoreCase("STREETFIGHTER")) {
    hp= 350;
    selector(Streetfighter, choice, Myers, myerhp, STFhp);
  }
}
public static void selector(Hero x, String y, Monster w, double zyx, double zy1) {
  int arm= 0;
  int armcount= 1;
  String restart= "";
  int ill= 0;
  int quit= 0;
  int swaelee= 0;
  zyx += w.MHealth;
  zy1 += x.HHealth;
  int Bshield= 0;
  int Bshieldcount= 4;
  int turncount= 1;
  int stfturncount= 0;
  int SFgg= 0;
  int SFggcount= 3;
  int STt= 0;
  int STtcount= 1;
  System.out.println("You've selected " + y + ", let the game begin!!!");
  System.out.println();
  while (x.HHealth > 0 && w.MHealth > 0 && quit != 1) {
    System.out.println("TURN: " + turncount);
    System.out.println("MONSTER HEALTH: " + w.MHealth);
    System.out.println("YOUR HEROES HEALTH: " + x.HHealth);
    System.out.println();
    while (true) {
      System.out.println("Would you like to use an item?");
      String askitem= IO.readString();
      if (askitem.equalsIgnoreCase("yes") || askitem.equalsIgnoreCase("no")) {
        if (askitem.equalsIgnoreCase("yes")) {
          System.out.println("1. HEALS(" + x.Healcount + "x)     2. ARMOR(" + armcount + "x)     3. SPECIAL: " + x.Special + "(" + x.specialcount + "x)");
          while (true) {
            System.out.println("Which Item do you wish to use? (Enter number next to your choice)");
            int chooseitem= IO.readInt();
            if (chooseitem== 1 || chooseitem== 2 || chooseitem== 3) {
              if (chooseitem== 1) {
                UseHeal(x, zy1, 1);
                break;
              }
              if (chooseitem== 2) {
                if (armcount== 0) {
                  System.out.println("You already used your armor!!");
                  continue;
                } else {
                    arm += 1;
                    armcount -= 1;
                    System.out.println("You have equipped your armor");
                }
                break;
              }
              if (chooseitem== 3) {
                if (y.equalsIgnoreCase("bruiser")) {
                  if (Bshieldcount == 0) {
                    System.out.println("You have no Shield uses remaining!!");
                    continue;
                  } else {
                    if (Bshield == 1) {
                      System.out.println("You already have a shield equipped!");
                    }
                    if (Bshield == 0) {
                      Bshield += 1;
                      Bshieldcount -= 1;
                      x.specialcount -= 1;
                      System.out.println("You have equipped your shield!");
                    }
                  }
                }
                if (y.equalsIgnoreCase("swordfighter")) {
                  if (SFggcount== 0) {
                    System.out.println("You have no Gunpowder grenades remaining!");
                    continue;
                  } else {
                    if (SFgg== 1) {
                      System.out.println("You already have a gunpowder grenade equipped!");
                    }
                    if (SFgg== 0) {
                      SFgg += 1;
                      SFggcount -= 1;
                      x.specialcount -= 1;
                      System.out.println("You have equipped your gundpowder grenades!");
                    }
                  }
                }
                if (y.equalsIgnoreCase("streetfighter")) {
                  if (turncount <= 3) {
                    System.out.println("Cannot use taunt special until 4th turn of game!");
                  } else {
                    if (STtcount== 0) {
                      System.out.println("You already used your taunt!");
                    } else {
                      STt += 1;
                      STtcount -= 1;
                      x.specialcount -= 1;
                      System.out.println("You have activated your taunt ability!");
                      }
                  }
                }
                break;
              }
            } else {
              System.out.println("INVALID ENTRY, TRY AGAIN!");
            }
          }
          break;
        }
        if (askitem.equalsIgnoreCase("no")) {
          break;
        }
      } else {
        System.out.println("INVALID ENTRY TRY AGAIN!");
      }
    }
    System.out.println("CHOOSE YOUR MOVE:");
    System.out.println();
    System.out.println("1. ATTACK     2. DEFEND     3. FLEE BATTLE (Enter number next to your choice)");
    int selection= IO.readInt();
    if (selection == 1) {
      swaelee += fight(w, x, y, 1, zyx, zy1, arm, Bshield, SFgg);
    }
    if (selection == 2) {
      swaelee += fight(w, x, y, 2, zyx, zy1, arm, Bshield, SFgg);
    }
    if (SFgg == 1 && swaelee == 1) {
      SFgg -= 1;
      swaelee -= 1;
    }
    if (Bshield == 1 && swaelee == 1) {
      Bshield -= 1;
      swaelee -= 1;
    }
    if (arm == 1 && swaelee == 1) {
      arm -= 1;
      swaelee -= 1;
    }
    if (STt == 1 && stfturncount <= 4) {
      stfturncount += 1;
    }
    if (STt == 1 && stfturncount== 5) {
      STt -= 1;
    }
    if (selection == 3) {
      while (true) {
        quit += 1;
        System.out.println();
        System.out.println("Your hero has fled the battle, and the Monster won.");
        System.out.println();
        System.out.println("Would you like to restart the game?");
        restart= IO.readString();
        if (restart.equalsIgnoreCase("no") || restart.equalsIgnoreCase("yes")) {
          if (restart.equalsIgnoreCase("no")) {
            System.out.println("Thanks for playing!");
            System.exit(0);
          }
          if (restart.equalsIgnoreCase("yes")) {
            ill += 1;
            System.out.println();
            System.out.println("The Hero will fight again!");
            break;
          }
        } else {
          System.out.println("INVALID ENTRY, TRY AGAIN!");
        }
      }
    }
    int posflee= MonsterFlee(turncount, w, x, STt);
    if (posflee == 1 && ill == 0) {
      while (true) {
        quit += 1;
        System.out.println();
        System.out.println("The hero is too strong for the monster, so the monster fled! Your Hero has won!!!!!");
        System.out.println();
        System.out.println("Would you like to restart the game?");
        String restart1= IO.readString();
        if (restart1.equalsIgnoreCase("no") || restart1.equalsIgnoreCase("yes")) {
          if (restart1.equalsIgnoreCase("no")) {
            System.out.println("Thanks for playing!");
            System.exit(0);
          }
          if (restart1.equalsIgnoreCase("yes")) {
            System.out.println();
            System.out.println("The Hero will fight again!");
            break;
          }
        } else {
          System.out.println("INVALID ENTRY, TRY AGAIN!");
        }
      }
    }
    System.out.println();
    turncount += 1;
  }
  if (x.HHealth <= 0 || w.MHealth <= 0) {
    if (x.HHealth <= 0) {
        System.out.println();
        System.out.println("Your hero has no health remaining, the battle is lost!");
        System.out.println("The monster won with " + w.MHealth + " health remaining.");
        System.out.println();
        while (true) {
          System.out.println("Would you like to restart the game?");
          String reestart= IO.readString();
          if (reestart.equalsIgnoreCase("yes") || reestart.equalsIgnoreCase("no")) {
            if (reestart.equalsIgnoreCase("no")) {
              System.out.println("Thanks for playing!");
              System.exit(0);
            }
            if (reestart.equalsIgnoreCase("yes")) {
              System.out.println();
              System.out.println("The hero will fight again!");
              break;
            }
          } else {
            System.out.println("INVALID ENTRY, TRY AGAIN!");
          }
        }
      }
      if (w.MHealth <= 0) {
          System.out.println();
          System.out.println("The monster has no health remaining, your hero has won the battle!!!!!!");
          System.out.println("The hero won with " + x.HHealth + " health remaining.");
          System.out.println();
          while (true) {
            System.out.println("Would you like to restart the game?");
            String reestart= IO.readString();
            if (reestart.equalsIgnoreCase("yes") || reestart.equalsIgnoreCase("no")) {
              if (reestart.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing!");
                System.exit(0);
              }
              if (reestart.equalsIgnoreCase("yes")) {
                System.out.println();
                System.out.println("The hero will fight again!");
                break;
              }
            } else {
              System.out.println("INVALID ENTRY, TRY AGAIN!");
            }
          }
        }
  }
  }
  public static int HeroAttack(Hero n, String m) {
    int yup= 0;
    if (m.equalsIgnoreCase("Bruiser")) {
      if (Math.random() * 100 > 67.0) {
        yup += 0;
      } else {
        if (Math.random() * 100 <= 80.0) {
          yup+= 90;
        } else {
          yup+= 130;
        }
      }
    }
    if (m.equalsIgnoreCase("Swordfighter")) {
      if (Math.random() * 100 > 73.5) {
          yup += 0;
        } else {
          if (Math.random() * 100 <= 80.0) {
            yup += 70;
          } else {
            yup += 110;
          }
        }
      }
    if (m.equalsIgnoreCase("Streetfighter")) {
      if (Math.random() * 100 > 79.75) {
        yup += 0;
      } else {
        if (Math.random() * 100 <= 80.0) {
          yup += 60;
        } else {
          yup += 95;
        }
      }
    }
    return yup;
  }
  public static int MonsterAttack(Monster f) {
    int yer;
    if (Math.random() * 100 > 80.0) {
      yer= 0;
    } else {
      if (Math.random() * 100 <= 85.0) {
        yer= 60;
      } else {
        yer= 110;
      }
    }
    return yer;
  }
  public static int HeroDefense(Hero b, String a, int bbs) {
    int def= 0;
    if (a.equalsIgnoreCase("Bruiser")) {
      if (bbs== 1) {
        def += 3;
      } else {
        if (Math.random() * 100 <= 55.0) {
          def += 1;
        } else {
          def += 2;
        }
      }
    }
    if (a.equalsIgnoreCase("Swordfighter")) {
      if (Math.random() * 100 <= 75.0) {
        def += 1;
      } else {
        def += 2;
      }
    }
    if (a.equalsIgnoreCase("Streetfighter")) {
      if (Math.random() * 100 <= 90.0) {
        def += 1;
      } else {
        def += 2;
      }
    }
    return def;
  }
  public static int MonsterDefense(Monster q) {
    int mdef= 0;
    if (Math.random() * 100 <= 66.0) {
      mdef += 1;
    } else {
      mdef += 2;
    }
    return mdef;
  }
  public static String MonsterChoice(Monster l) {
    String ui;
    if (Math.random() * 100 <= 50.0) {
      ui= "attack"; //attack
    } else {
      ui= "defend"; //defend
    }
    return ui;
  }
  public static int HeroAccuracy(Hero ww, String xx) {
    int ryt = 0;
    if (xx.equalsIgnoreCase("bruiser")) {
      if (Math.random() * 100 > 67.0) {
        ryt += 0; //missed
      } else {
        ryt += 1; //landed
      }
    }
    if (xx.equalsIgnoreCase("swordfighter")) {
      if (Math.random() * 100 > 73.5) {
        ryt += 0;
      } else {
        ryt += 1;
      }
    }
    if (xx.equalsIgnoreCase("STREETFIGHTER")) {
      if (Math.random() * 100 > 79.75) {
        ryt += 0;
      } else {
        ryt += 1;
      }
    }
    return ryt;
  }
  public static int fight(Monster o, Hero p, String e, int slct, double Mhp, double Hhp, int armah, int xbs, int gg) {
    String wha= MonsterChoice(o);
    int a1;
    int swae= 0;
    double a2;
    if (slct== 1 && wha.equalsIgnoreCase("attack")) {
      a1= HeroAttack(p, e);
      if (gg == 1) {
        o.MHealth -= 110;
        System.out.println("Your gunpowder grenade stunned the monster, and your hero landed a power strike, dealing 110 damage!");
        System.out.println();
        System.out.println("The Monster now has " + o.MHealth + " health remaining.");
        swae += 1;
      } else {
        if (a1== 0) {
          System.out.println();
          System.out.println("You Attacked the Monster, but the attack missed!");
          } else {
          if (a1 <= 90) {
            o.MHealth -= a1;
            System.out.println();
            System.out.println("You Attacked the Monster, and landed a clean strike, dealing " + a1 + " damage!");
            System.out.println();
            System.out.println("The Monster now has " + o.MHealth + " health remaining.");
            }
          if (a1 > 90) {
            o.MHealth -= a1;
            System.out.println("You attacked the monster, and landed a power strike, dealing " + a1 + " damage!");
            System.out.println();
            System.out.println("The Monster now has " + o.MHealth + " health remaining.");
            }
        }
        a2= MonsterAttack(o);
        if (a2== 0) {
          System.out.println();
          System.out.println("The monster attacked back, but missed!");
          } else {
          if (a2 < 100 && armah== 0) {
            p.HHealth -= a2;
            System.out.println();
            System.out.println("The monster attacked back, and landed a clean strike, dealing " + a2 + " damage!");
            System.out.println();
            System.out.println("Your hero now has " + p.HHealth + " health remaining.");
            }
          if (a2 > 100 && armah== 0) {
            p.HHealth -= a2;
            System.out.println("The monster attacked back, and landed a power strike, dealing " + a2 + " damage!");
            System.out.println();
            System.out.println("Your hero now has " + p.HHealth + " health remaining.");
          }
          if (armah== 1 && a2 > 100) {
            System.out.println();
            System.out.println("The monster landed a power strike, but your Heroes armor absorbed it! No damage was taken! Heroes armor is now broken.");
            swae += 1;
          }
          if (armah== 1 && a2 < 100) {
            System.out.println();
            System.out.println("The monster landed a clean strike, but your Heroes armor absorbed it! No damage was taken! Heroes armor is now broken.");
            swae += 1;
          }
        }
      }
      }
      if (slct== 1 && wha.equalsIgnoreCase("defend")) {
        a1= MonsterDefense(o);
        a2= HeroAccuracy(p, e);
        if (gg== 1) {
          o.MHealth -= 110;
          System.out.println("Your gunpowder grenade stunned the monster, and your hero landed a power strike, dealing 110 damage!");
          System.out.println();
          System.out.println("The Monster now has " + o.MHealth + " health remaining.");
          swae += 1;
        } else {
          if (a2 == 0) {
            System.out.println("The monster defended, and your Hero missed their attack!");
            } else {
            if (a1== 1) {
              System.out.println();
              System.out.println("The monster perfectly dodged your strike! No damage was inflicted!");
              } else {
              o.MHealth -= p.HSwipe;
              System.out.println("The monster defended your strike, but it still made contact!");
              System.out.println();
              System.out.println("The monster now has " + o.MHealth + " health remaining");
              }
          }
        }
      }
      if (slct== 2 && wha.equalsIgnoreCase("attack")) {
        a1= HeroDefense(p, e, xbs);
        a2= o.MAccuracy;
        if (Math.random() * 100 > 65.0) {
          System.out.println("You defended, but monster missed their attack anyways!");
          } else {
          if (a1== 1 || a1 == 3) {
            if (a1== 1) {
              System.out.println();
              System.out.println("You perfectly dodged the monsters strike! No damage was taken!");
              }
            if (a1== 3) {
              o.MHealth -= 50;
              System.out.println();
              System.out.println("The monsters strike hit your shield, and you were able to counter! A shield use was consumed.");
              System.out.println("The monster now has " + o.MHealth + " health remaining.");
              swae += 1;
            }
          } else {
            p.HHealth -= o.MSwipe;
            System.out.println("You defended the monsters strike, but it still made contact!");
            System.out.println();
            System.out.println("Your hero now has " + p.HHealth + " health remaining");
            }
        }
      }
      if (slct== 2 && wha.equalsIgnoreCase("defend")) {
        System.out.println();
        System.out.println("A staring contest ensues, No one attacked!");
        }
      return swae;
    }
    public static void UseHeal(Hero rt, double xhp, int chseitm) {
      if (chseitm== 1 && rt.Healcount > 0) {
        rt.HHealth += rt.Heal;
        rt.Healcount--;
        System.out.println();
        System.out.println("You used 1 heal item! Your hero restored " + rt.Heal + " health and now has " + rt.HHealth + " health remaining!");
      }
      if (chseitm== 1 && rt.Healcount == 0) {
        System.out.println("You have no heal items remaining!");
      }
    }
    public static int MonsterFlee(int trncnt, Monster glee, Hero sg, int tts) {
      int fleer= 0;
      if (trncnt <= 3) {
        fleer += 0;
      }
      if (trncnt > 3 && tts == 1) {
        if (glee.MHealth > (sg.HHealth + 50)) {
            if ((Math.random() * 100) <= 8.0) {
              fleer += 1;
            } else {
              fleer += 0;
            }
          }
          if (sg.HHealth < glee.MHealth && glee.MHealth < (sg.HHealth + 60)) {
            if ((Math.random() * 100) <= 12.0) {
              fleer += 1;
            } else {
              fleer += 0;
            }
          }
          if (sg.HHealth - glee.MHealth <=25 && sg.HHealth - glee.MHealth >= 0) {
            if ((Math.random() * 100) <= 16.0) {
              fleer += 1;
            } else {
              fleer += 0;
            }
          }
          if (sg.HHealth - glee.MHealth > 25 && sg.HHealth - glee.MHealth < 75) {
            if ((Math.random() * 100) <= 20.0) {
              fleer += 1;
            } else {
              fleer += 0;
            }
          }
          if (sg.HHealth - glee.MHealth > 75 && sg.HHealth - glee.MHealth < 125) {
            if ((Math.random() * 100) <= 29.0) {
              fleer += 1;
            } else {
              fleer += 0;
            }
          }
          if (sg.HHealth - glee.MHealth > 125) {
            if ((Math.random() * 100) <= 40.0) {
              fleer += 1;
            } else {
              fleer += 0;
            }
          }
        }
      if (trncnt > 3 && tts == 0) {
        if (glee.MHealth > (sg.HHealth + 50)) {
          if ((Math.random() * 100) <= 4.0) {
            fleer += 1;
          } else {
            fleer += 0;
          }
        }
        if (sg.HHealth < glee.MHealth && glee.MHealth < (sg.HHealth + 60)) {
          if ((Math.random() * 100) <= 6.0) {
            fleer += 1;
          } else {
            fleer += 0;
          }
        }
        if (sg.HHealth - glee.MHealth <=25 && sg.HHealth - glee.MHealth >= 0) {
          if ((Math.random() * 100) <= 8.0) {
            fleer += 1;
          } else {
            fleer += 0;
          }
        }
        if (sg.HHealth - glee.MHealth > 25 && sg.HHealth - glee.MHealth < 75) {
          if ((Math.random() * 100) <= 10.0) {
            fleer += 1;
          } else {
            fleer += 0;
          }
        }
        if (sg.HHealth - glee.MHealth > 75 && sg.HHealth - glee.MHealth < 125) {
          if ((Math.random() * 100) <= 14.5) {
            fleer += 1;
          } else {
            fleer += 0;
          }
        }
        if (sg.HHealth - glee.MHealth > 125) {
          if ((Math.random() * 100) <= 20.0) {
            fleer += 1;
          } else {
            fleer += 0;
          }
        }
      }
      return fleer;
    }
  }
