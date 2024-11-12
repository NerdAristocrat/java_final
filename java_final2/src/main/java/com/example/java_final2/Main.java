package com.example.java_final2;

import com.example.java_final2.Model.Arqueiro;
import com.example.java_final2.Model.Gigante;
import com.example.java_final2.Model.Guerreiro;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        Arqueiro arqueiro = new Arqueiro();

        arqueiro.setDano(65);

        arqueiro.setVida(35);

        arqueiro.setVelocidade(50);

        Guerreiro guerreiro = new Guerreiro();

        guerreiro.setDano(50);

        guerreiro.setVida(50);

        guerreiro.setVelocidade(50);

        Gigante gigante = new Gigante();

        gigante.setDano(65);

        gigante.setVida(65);

        gigante.setVelocidade(20);

        int i = 0;

        int choice = 0;

        int escolha = 0;

        int escolha2 = 0;

        int xp = 0;

        int uso_xp = 0;

        System.out.println("\n----MENU----");

        System.out.print("Bem-vindo(a)! Selecione sua classe de herói: \n");

        System.out.println("1- Arqueiro (DMG: 65; VIDA: 35; VEL: 50)");

        System.out.println("2- Guerreiro (DMG: 50; VIDA: 50; VEL: 50) ");

        System.out.println("3- Gigante (DMG: 65; VIDA: 65; VEL: 20) ");

        System.out.println("\n OBS.: \nDMG: quanto dano seu herói causa;\nVIDA: quanta vida ele tem; \nVEL: indica quantas vezes seu herói pode atacar(vel/10 = quantidade de ataques)");

        choice = s.nextInt();

        switch(choice)
        {
            case 1:

                while(i==0)
                {
                    System.out.print("\n\nO que deseja fazer?\n");

                    System.out.println("1- Melhorar personagem");

                    System.out.println("2- Batalhar");

                    System.out.println("3- Sair");

                    escolha = s.nextInt();

                    switch(escolha)
                    {
                        case 1:

                            if(xp<=0)
                            {
                                System.out.print("Você possui 0 xp. Batalhe mais para melhorar seu personagem!");

                                break;
                            }

                            else
                            {
                                System.out.printf("Você possui %d xp. Escolha com sabedoria:\n", xp);

                                System.out.println("1- DMG");

                                System.out.println("2- VIDA");

                                System.out.println("3- VEL");

                                escolha2 = s.nextInt();

                                switch(escolha2)
                                {
                                    case 1:

                                        System.out.print("Quanto xp? A quantidade de xp que você colocar será totalmente convertida em pontos de DMG\n");

                                        uso_xp = s.nextInt();

                                        if(uso_xp>xp)
                                        {
                                            System.out.print("Bela tentativa, mas não vai rolar. Tente um valor válido.");

                                            break;
                                        }

                                        else
                                        {
                                            arqueiro.addDano(uso_xp);

                                            System.out.printf("Novos stats: DMG: %d; VIDA: %d; VEL: %d", arqueiro.getDano(), arqueiro.getVida(), arqueiro.getVelocidade());

                                            xp = xp-uso_xp;

                                            break;
                                        }

                                    case 2:

                                        System.out.print("Quanto xp? A quantidade de xp que você colocar será totalmente convertida em pontos de VIDA\n");

                                        uso_xp = s.nextInt();

                                        if(uso_xp>xp)
                                        {
                                            System.out.print("Bela tentativa, mas não vai rolar. Tente um valor válido.");

                                            break;
                                        }

                                        else
                                        {
                                            arqueiro.addVida(uso_xp);

                                            System.out.printf("Novos stats: DMG: %d; VIDA: %d; VEL: %d", arqueiro.getDano(), arqueiro.getVida(), arqueiro.getVelocidade());

                                            xp = xp-uso_xp;

                                            break;
                                        }

                                    case 3:

                                        System.out.print("Quanto xp? A quantidade de xp que você colocar será totalmente convertida em pontos de VEL\n");

                                        uso_xp = s.nextInt();

                                        if(uso_xp>xp)
                                        {
                                            System.out.print("Bela tentativa, mas não vai rolar. Tente um valor válido.");

                                            break;
                                        }

                                        else
                                        {
                                            arqueiro.addVelocidade(uso_xp);

                                            System.out.printf("Novos stats: DMG: %d; VIDA: %d; VEL: %d", arqueiro.getDano(), arqueiro.getVida(), arqueiro.getVelocidade());

                                            xp = xp-uso_xp;

                                            break;
                                        }
                                }
                            }

                            break;

                        case 2:

                            int vidamonstro = 1000;

                            int danomonstro = 100;

                            System.out.print("O monstro tem 1000 de vida e causa 100 de dano. Boa sorte!\n");

                            int vidaparcial = arqueiro.getVida();

                            while(vidaparcial>0)
                            {
                                System.out.print("Você atacou;\n");

                                vidamonstro = vidamonstro-(arqueiro.getDano()*arqueiro.getVelocidade()/10);

                                if(vidamonstro<=0)
                                {
                                    break;
                                }

                                else
                                {
                                    System.out.print("O monstro ataca;\n");

                                    vidaparcial = vidaparcial-danomonstro;
                                }
                            }

                            if(vidamonstro<=0)
                            {
                                System.out.print("Você zerou o jogo! Parabéns!");
                            }

                            else
                            {
                                System.out.print("Você perdeu. Volte mais forte!");

                                xp = xp+20;
                            }

                            break;

                        case 3:
                            i=1;

                            break;

                    }
                }





            case 2:

                while(i==0)
                {
                    System.out.print("\n\nO que deseja fazer?\n");

                    System.out.println("1- Melhorar personagem");

                    System.out.println("2- Batalhar");

                    System.out.println("3- Sair");

                    escolha = s.nextInt();

                    switch(escolha)
                    {
                        case 1:

                            if(xp<=0)
                            {
                                System.out.print("Você possui 0 xp. Batalhe mais para melhorar seu personagem!");

                                break;
                            }

                            else
                            {
                                System.out.printf("Você possui %d xp. Escolha com sabedoria:\n", xp);

                                System.out.println("1- DMG");

                                System.out.println("2- VIDA");

                                System.out.println("3- VEL");

                                escolha2 = s.nextInt();

                                switch(escolha2)
                                {
                                    case 1:

                                        System.out.print("Quanto xp? A quantidade de xp que você colocar será totalmente convertida em pontos de DMG\n");

                                        uso_xp = s.nextInt();

                                        if(uso_xp>xp)
                                        {
                                            System.out.print("Bela tentativa, mas não vai rolar. Tente um valor válido.");

                                            break;
                                        }

                                        else
                                        {
                                            guerreiro.addDano(uso_xp);

                                            System.out.printf("Novos stats: DMG: %d; VIDA: %d; VEL: %d", guerreiro.getDano(), guerreiro.getVida(), guerreiro.getVelocidade());

                                            xp = xp-uso_xp;

                                            break;
                                        }

                                    case 2:

                                        System.out.print("Quanto xp? A quantidade de xp que você colocar será totalmente convertida em pontos de VIDA\n");

                                        uso_xp = s.nextInt();

                                        if(uso_xp>xp)
                                        {
                                            System.out.print("Bela tentativa, mas não vai rolar. Tente um valor válido.");

                                            break;
                                        }

                                        else
                                        {
                                            guerreiro.addVida(uso_xp);

                                            System.out.printf("Novos stats: DMG: %d; VIDA: %d; VEL: %d", guerreiro.getDano(), guerreiro.getVida(), guerreiro.getVelocidade());

                                            xp = xp-uso_xp;

                                            break;
                                        }

                                    case 3:

                                        System.out.print("Quanto xp? A quantidade de xp que você colocar será totalmente convertida em pontos de VEL\n");

                                        uso_xp = s.nextInt();

                                        if(uso_xp>xp)
                                        {
                                            System.out.print("Bela tentativa, mas não vai rolar. Tente um valor válido.");

                                            break;
                                        }

                                        else
                                        {
                                            guerreiro.addVelocidade(uso_xp);

                                            System.out.printf("Novos stats: DMG: %d; VIDA: %d; VEL: %d", guerreiro.getDano(), guerreiro.getVida(), guerreiro.getVelocidade());

                                            xp = xp-uso_xp;

                                            break;
                                        }
                                }
                            }

                            break;

                        case 2:

                            int vidamonstro = 1000;

                            int danomonstro = 100;

                            System.out.print("O monstro tem 1000 de vida e causa 100 de dano. Boa sorte!\n");

                            int vidaparcial = guerreiro.getVida();

                            while(vidaparcial>0)
                            {
                                System.out.print("Você atacou;\n");

                                vidamonstro = vidamonstro-(guerreiro.getDano()*guerreiro.getVelocidade()/10);

                                if(vidamonstro<=0)
                                {
                                    break;
                                }

                                else
                                {
                                    System.out.print("O monstro ataca;\n");

                                    vidaparcial = vidaparcial-danomonstro;
                                }
                            }

                            if(vidamonstro<=0)
                            {
                                System.out.print("Você zerou o jogo! Parabéns!");
                            }

                            else
                            {
                                System.out.print("Você perdeu. Volte mais forte!");

                                xp = xp+20;
                            }

                            break;

                        case 3:
                            i=1;

                            break;

                    }
                }


            case 3:

                while(i==0)
                {
                    System.out.print("\n\nO que deseja fazer?\n");

                    System.out.println("1- Melhorar personagem");

                    System.out.println("2- Batalhar");

                    System.out.println("3- Sair");

                    escolha = s.nextInt();

                    switch(escolha)
                    {
                        case 1:

                            if(xp<=0)
                            {
                                System.out.print("Você possui 0 xp. Batalhe mais para melhorar seu personagem!");

                                break;
                            }

                            else
                            {
                                System.out.printf("Você possui %d xp. Escolha com sabedoria:\n", xp);

                                System.out.println("1- DMG");

                                System.out.println("2- VIDA");

                                System.out.println("3- VEL");

                                escolha2 = s.nextInt();

                                switch(escolha2)
                                {
                                    case 1:

                                        System.out.print("Quanto xp? A quantidade de xp que você colocar será totalmente convertida em pontos de DMG\n");

                                        uso_xp = s.nextInt();

                                        if(uso_xp>xp)
                                        {
                                            System.out.print("Bela tentativa, mas não vai rolar. Tente um valor válido.");

                                            break;
                                        }

                                        else
                                        {
                                            gigante.addDano(uso_xp);

                                            System.out.printf("Novos stats: DMG: %d; VIDA: %d; VEL: %d", gigante.getDano(), gigante.getVida(), gigante.getVelocidade());

                                            xp = xp-uso_xp;

                                            break;
                                        }

                                    case 2:

                                        System.out.print("Quanto xp? A quantidade de xp que você colocar será totalmente convertida em pontos de VIDA\n");

                                        uso_xp = s.nextInt();

                                        if(uso_xp>xp)
                                        {
                                            System.out.print("Bela tentativa, mas não vai rolar. Tente um valor válido.");

                                            break;
                                        }

                                        else
                                        {
                                            gigante.addVida(uso_xp);

                                            System.out.printf("Novos stats: DMG: %d; VIDA: %d; VEL: %d", gigante.getDano(), gigante.getVida(), gigante.getVelocidade());

                                            xp = xp-uso_xp;

                                            break;
                                        }

                                    case 3:

                                        System.out.print("Quanto xp? A quantidade de xp que você colocar será totalmente convertida em pontos de VEL\n");

                                        uso_xp = s.nextInt();

                                        if(uso_xp>xp)
                                        {
                                            System.out.print("Bela tentativa, mas não vai rolar. Tente um valor válido.");

                                            break;
                                        }

                                        else
                                        {
                                            gigante.addVelocidade(uso_xp);

                                            System.out.printf("Novos stats: DMG: %d; VIDA: %d; VEL: %d", gigante.getDano(), gigante.getVida(), gigante.getVelocidade());

                                            xp = xp-uso_xp;

                                            break;
                                        }
                                }
                            }

                            break;

                        case 2:

                            int vidamonstro = 1000;

                            int danomonstro = 100;

                            System.out.print("O monstro tem 1000 de vida e causa 100 de dano. Boa sorte!");

                            int vidaparcial = gigante.getVida();

                            while(vidaparcial>0)
                            {
                                System.out.print("Você atacou;\n");

                                vidamonstro = vidamonstro-(gigante.getDano()*gigante.getVelocidade()/10);

                                if(vidamonstro<=0)
                                {
                                    break;
                                }

                                else
                                {
                                    System.out.print("O monstro ataca;\n");

                                    vidaparcial = vidaparcial-danomonstro;
                                }
                            }

                            if(vidamonstro<=0)
                            {
                                System.out.print("Você zerou o jogo! Parabéns!");
                            }

                            else
                            {
                                System.out.print("Você perdeu. Volte mais forte!");

                                xp = xp+20;
                            }

                            break;

                        case 3:

                            i=1;

                            break;

                    }
                }



        }
    }
}