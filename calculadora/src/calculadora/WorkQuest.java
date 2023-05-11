package calculadora;

import java.util.ArrayList;

import java.util.Scanner;

public class WorkQuest {

	static int atribute_points = 72;
	
	public static void main (String[] args) {

		//Mensagem de Início

				System.out.println("Olá! Bem-vindo ao WorkQuest! Um sistema de gamificação baseada no sistema de RPG: Dungeons and Dragons 5º Edição.\n");

		//Variáveis de preenchimento
				
				String name_play = "";
				String name_char = "";

//			Cadastro do player + Reiniciar para preencher a ficha novamente
			
			while(name_play.isEmpty()) {
				Scanner enter_name_player = new Scanner(System.in);
					System.out.println("Digite o seu nome de jogador:");
				String name_player = enter_name_player.nextLine();
					name_play = name_player;
					if (name_play.isEmpty()) {
						System.out.println("\nPor favor, digite seu nome:\n");
					} else 
						System.out.println("\nCerto "+name_player+", agora iremos criar sua ficha.");
			}
			
		//Raça do Char
			
			 ArrayList<String> races = new ArrayList<>();

				System.out.println("\nUtilizando como base o Livro do Jogador, temos as seguintes raças no mundo de D&D:");

				races.add(" Anão");
				races.add(" Draconato");
				races.add(" Elfo");
				races.add(" Gnomo");
				races.add(" Halfling");
				races.add(" Humano");
				races.add(" Meio-elfo");
				races.add(" Meio-orc");
				races.add(" Tiferino");

				for (int i = 0; i < races.size(); i++) {
		            System.out.println((i + 1) + ". " + races.get(i));
		        }
				 
			        System.out.println("\nDigite o número correspondente à raça que você deseja jogar:");
			        Scanner enter_race = new Scanner(System.in);
			        int chosen_race_index = enter_race.nextInt();

			        if (chosen_race_index >= 1 && chosen_race_index <= races.size()) {
			            String chosen_race = races.get(chosen_race_index - 1);
			            System.out.println("\nVocê escolheu a raça " + chosen_race + ". Agora iremos prosseguir com a criação da ficha.\n");
			            menu_races();
			        } else {
			            System.out.println("\nOpção inválida. Encerrando o programa.\n");
			            return;
			        }

			       
			        
			        ArrayList<String> classes = new ArrayList<>();
					System.out.println("\nUtilizando como base o Livro do Jogador, temos as seguintes classes com suas informações, do mundo de D&D:");

					classes.add(" Artífice: é uma classe que combina habilidades mágicas com proficiência em ferramentas e habilidades tecnológicas.");
					classes.add(" Bárbaro: é uma classe que possui um estilo de combate feroz e uma resistência incrível.");
					classes.add(" Bardo: é uma classe que combina magia com habilidades de performance para inspirar aliados e derrotar inimigos");
					classes.add(" Bruxo: é uma classe que faz pactos com seres poderosos para obter habilidades mágicas e invocações sombrias.");
					classes.add(" Clérigo: é uma classe que canaliza a energia divina para lançar magias e curar aliados em nome de sua divindade.");
					classes.add(" Druida: é uma classe que possui um forte vínculo com a natureza, podendo se transformar em animais e lançar magias baseadas no ambiente natural.");
					classes.add(" Feiticeiro: é uma classe que possui um talento inato para a magia, sendo capaz de lançar magias poderosas de forma espontânea.");
					classes.add(" Guerreiro: é uma classe de combatente versátil, capaz de utilizar diversas armas e armaduras, e se especializar em diferentes estilos de luta");
					classes.add(" Ladino: é uma classe é um especialista em furtividade e habilidades sociais, capaz de realizar ataques furtivos e desarmar armadilhas.");
					classes.add(" Mago: é uma classe usuária da magia poderoso e versátil, capaz de lançar uma grande variedade de magias de ataque, defesa e utilidade.");
					classes.add(" Monge: é uma classe especialista em artes marciais e disciplina física, capaz de realizar ataques desarmados e canalizar sua energia interna para realizar feitos extraordinários.");
					classes.add(" Paladino: é uma classe capaz de utilizar magias sagradas e defender a justiça e o bem em nome de sua divindade");
					classes.add(" Patrulheiro: é uma classe especialista em sobrevivência e caça, capaz de rastrear inimigos e se adaptar a diferentes ambientes.");

			for (int i = 0; i < classes.size(); i++) {
				System.out.println((i + 1) + ". " + classes.get(i));
			}
			
	        System.out.println("\nDigite o número correspondente à raça que você deseja jogar:");
			Scanner enter_classes = new Scanner(System.in);
	        int chosen_classes_index = enter_classes.nextInt();

	        if (chosen_classes_index >= 1 && chosen_classes_index <= classes.size()) {
	            String chosen_classes = classes.get(chosen_classes_index - 1);
	            System.out.println("\nVocê escolheu a raça " + chosen_classes + ". Agora iremos prosseguir com a criação da ficha.\n");
	        } else {
	            System.out.println("\nOpção inválida. Encerrando o programa.\n");
	            return;

	        }

					menu_classes();
				
			//Background do Char
				
					ArrayList<String> backgrounds = new ArrayList<>();
					System.out.println("\nUtilizando como base o Livro do Jogador, temos os seguintes antecedentes com suas informações, do mundo de D&D:");

					backgrounds.add("Acólito");
					backgrounds.add("Artesão de Guilda");
					backgrounds.add("Artista");
					backgrounds.add("Assombrado");
					backgrounds.add("Charlatão");
					backgrounds.add("Criminoso");
					backgrounds.add("Eremita");
					backgrounds.add("Forasteiro");
					backgrounds.add("Herói do Povo");
					backgrounds.add("Marinheiro");
					backgrounds.add("Nobre");
					backgrounds.add("Órfão");
					backgrounds.add("Sábio");
					backgrounds.add("Soldado");

			for (int i = 0; i < backgrounds.size(); i++) {
				System.out.println((i + 1) + ". " + backgrounds.get(i));
			}
			
	        System.out.println("\nDigite o número correspondente à raça que você deseja jogar:");
			Scanner enter_backgrounds = new Scanner(System.in);
	        int chosen_backgrounds_index = enter_backgrounds.nextInt();

	        if (chosen_backgrounds_index >= 1 && chosen_backgrounds_index <= backgrounds.size()) {
	            String chosen_backgrounds = backgrounds.get(chosen_backgrounds_index - 1);
	            System.out.println("\nVocê escolheu a raça " + chosen_backgrounds + ". Agora iremos prosseguir com a criação da ficha.\n");
	        } else {
	            System.out.println("\nOpção inválida. Encerrando o programa.\n");
	            return;

	        }
					

					menu_backgrounds();

			//Alinhamento do Char
				
					ArrayList<String> alignment = new ArrayList<>();
					System.out.println("\nUtilizando como base o Livro do Jogador, temos os seguintes antecedentes com suas informações, do mundo de D&D:");

				alignment.add(" Bom e Leal");
				alignment.add(" Bom e Neutro");
				alignment.add(" Bom e Caótico");
				alignment.add(" Neutro e Leal");
				alignment.add(" Neutro");
				alignment.add(" Neutro e Caótico");
				alignment.add(" Mal e Leal");
				alignment.add(" Mal e Neutro");
				alignment.add(" Mal e Caótico");

				for (int i = 0; i < alignment.size(); i++) {
					System.out.println((i + 1) + ". " + alignment.get(i));
				}
				
		        System.out.println("\nDigite o número correspondente à raça que você deseja jogar:");
				Scanner enter_alignment = new Scanner(System.in);
		        int chosen_alignment_index = enter_alignment.nextInt();

		        if (chosen_alignment_index >= 1 && chosen_alignment_index <= alignment.size()) {
		            String chosen_alignment = alignment.get(chosen_alignment_index - 1);
		            System.out.println("\nVocê escolheu a raça " + chosen_alignment + ". Agora iremos prosseguir com a criação da ficha.\n");
		        } else {
		            System.out.println("\nOpção inválida. Encerrando o programa.\n");
		            return;

		        }
				

					menu_alignments();
					
			//Nome do Char
					
					System.out.println("\nCerto, agora digite o nome do seu personagem:");
								
								while(name_char.isEmpty()) {
									Scanner enter_name_character = new Scanner(System.in);
										System.out.println("\nDigite o nome do seu personagem:");
									String name_character = enter_name_character.nextLine();
										name_char = name_character;
										if (name_char.isEmpty()) {
											System.out.println("\nPor favor, digite o nome do seu personagem:\n");
										} else 
											System.out.println("\nTudo ok! Seu personagem: "+name_character+" foi criado! Agora devemos distribuir os pontos aos seus Valores de Habilidade.");
								}				
								
							// Atributos de Char

								int strength = 0;
								int dexterity = 0;
								int constitution = 0;
								int intelligence = 0;
								int wisdom = 0;
								int charisma = 0;
									
							// Modificadores de Atributos de Char	
								
								int mod_str = 0;
								int mod_dex = 0;
								int mod_con = 0;
								int mod_int = 0;
								int mod_wis = 0;
								int mod_cha = 0;
								
							// Testes de Resistências de Char
								
								int save_throw_str = mod_str;
								int save_throw_dex = mod_dex;
								int save_throw_con = mod_con;
								int save_throw_int = mod_int;
								int save_throw_wis = mod_wis;
								int save_throw_cha = mod_cha;
								
							// Informações de Char
								
								int level = 1;				
								int proficiency_bonus = +2;
								int initiative = mod_dex;
								int armor_class = 10 + dexterity;
								int passive_perception = 10 + wisdom;
								int passive_intuition = passive_perception;
								int inspiration_points = 0;
								int exp_points = 0;
								
							// Perícias de Char
								
								int acrobatics = dexterity;
								int animal_handling = wisdom;
								int arcana = intelligence;
								int atletics = strength;
								int deception = wisdom;
								int history = wisdom;
								int intimidation = charisma;
								int investigation = intelligence;
								int medicine = wisdom;
								int nature = intelligence;
								int perception = wisdom;
								int performance = charisma;
								int persuasion = charisma;
								int religion = intelligence;
								int sleight_of_hand = dexterity;
								int stealth = dexterity;
								int survival = wisdom;

										// Sistema de Preenchimento de Atributos usando os Dados de RPG
								
										//System.out.println("\nPrimeiramente, possuimos 2 sistemas de preenchimentos de atributos que são:\n");	
										//System.out.println("1) Distribuição de 72 pontos entre os seis atributos: Força, Destreza, Constituição, Inteligência, Sabedoria e Carisma\n");
										//System.out.println("2) Gerar e jogar 4 dados de 6 lados (ou 4D6), o sistema anotará a soma dos três maiores resultados. Esse processo será repetido 6 vezes");
										//System.out.println("\nDigite abaixo 1 ou 2 para definir com qual sistema deseja:");
										
										//system_add_atributes();
										
										// Rolar D04 para atributos
										
									/*Dices_WorkQuest roll_dice_d04 = new Dices_WorkQuest();
										roll_dice_d04.Output_Dices_d04();
										System.out.println(+roll_d04());
										
										// Rolar D06 para atributos
										
										Dices_WorkQuest roll_dice_d06 = new Dices_WorkQuest();
										roll_dice_d06.Output_Dices_d06();
										System.out.println(+roll_d06());
										
										//Rolar D08 para atributos
										
										Dices_WorkQuest roll_dice_d08 = new Dices_WorkQuest();
										roll_dice_d08.Output_Dices_d08();
										System.out.println(+roll_d08());
										
										// Rolar D10 para atributos
										
										Dices_WorkQuest roll_dice_d10 = new Dices_WorkQuest();
										roll_dice_d10.Output_Dices_d10();
										System.out.println(+roll_d10());
										
										// Rolar D12 para atributos
										
										Dices_WorkQuest roll_dice_d12 = new Dices_WorkQuest();
										roll_dice_d12.Output_Dices_d12();
										System.out.println(+roll_d12());
										
										// Rolar D04 para atributos
										
										Dices_WorkQuest roll_dice_d20 = new Dices_WorkQuest();
										roll_dice_d20.Output_Dices_d20();
										System.out.println(+roll_d20());
			*/

}

//	Ficha do Player

//Menu Sistema

private static void menu_races() {

//Método para Raças e Sub-raças	
	
Scanner enter_race = new Scanner(System.in);
String races_player = enter_race.nextLine();

//Condição de Sub-raça

		switch(races_player) {
		
			case "1":
				
				 ArrayList<String> sub_dwarf = new ArrayList<>();
				
		
						System.out.println("\nCerto, temos duas sub-raças dos Anões, que são:");
	
				sub_dwarf.add(" Anão da Colina");
				sub_dwarf.add(" Anão da Montanha");

					for (int i = 0; i < sub_dwarf.size(); i++) {
						System.out.println((i + 1) + ". " + sub_dwarf.get(i));
	}
					
					System.out.println("Informe com qual você sub-raça dos Anões você deseja jogar:");

						Scanner enter_sub_dwarf = new Scanner(System.in);
						int sub_dwarf_player = enter_sub_dwarf.nextInt();
						
						
						
							switch(sub_dwarf_player) {
							
								case 1:
									System.out.println("\nCerto, seu personagem será um: "+sub_dwarf_player+". Agora vamos prosseguir para as classes.");
									return;
									
								case 2:
									System.out.println("\nCerto, seu personagem será um: "+sub_dwarf_player+". Agora vamos prosseguir para as classes.");
									return;
									
								default:
									System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
									menu_races_dwarf();
									return;
							}
								
			case "2":
				 
				ArrayList<String> sub_dragonborn = new ArrayList<>();
				
				
							System.out.println("\nCerto, temos dez opções de Ancestralidades Dracônicas, que são:");
			
				sub_dragonborn.add(" Azul");
				sub_dragonborn.add(" Branco");
				sub_dragonborn.add(" Bronze");
				sub_dragonborn.add(" Cobre");
				sub_dragonborn.add(" Latão");
				sub_dragonborn.add(" Negro");
				sub_dragonborn.add(" Ouro");
				sub_dragonborn.add(" Prata");
				sub_dragonborn.add(" Verde");
				sub_dragonborn.add(" Vermelho");

				for (int i = 0; i < sub_dragonborn.size(); i++) {
					System.out.println((i + 1) + ". " + sub_dragonborn.get(i));
					
				}
							System.out.println("Informe com qual você Ancestralidade Dracônica você deseja jogar:");
			
								Scanner enter_sub_dragonborn = new Scanner(System.in);
								int sub_dragonborn_player = enter_sub_dragonborn.nextInt();
									
									switch(sub_dragonborn_player) {
									
									case 1:
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										return;
										
									case 2:
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										return;
										
									case 3:
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										return;
										
									case 4:
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										return;
										
									case 5:
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										return;
										
									case 6:
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										return;
										
									case 7:	
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										return;
										
									case 8:
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										return;
										
									case 9:
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										
									case 10:	
										System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
										return;
										
									default:
										System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
										menu_races_dragonborn();
										return;
										
									}
								
			case "3":
				ArrayList<String> sub_elf = new ArrayList<>();
				
							System.out.println("\nCerto, temos três sub-raças dos Elfos, que são:");
			
				sub_elf.add(" Alto Elfo");
				sub_elf.add(" Elfo da Floresta");
				sub_elf.add(" Elfo Negro\n ");

				for (int i = 0; i < sub_elf.size(); i++) {
					System.out.println((i + 1) + ". " + sub_elf.get(i));
					
				}
			
							System.out.println("Informe com qual você sub-raça dos Elfos você deseja jogar:");
			
								Scanner enter_sub_elf = new Scanner(System.in);
								int sub_elf_player = enter_sub_elf.nextInt();
									
						switch(sub_elf_player) {
								
								case 1:
									System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as classes.");
									return;
									
								case 2:
									System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as classes.");
									return;
									
								case 3:
									System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as classes.");
									return;
									
							default:
								System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
								menu_races_elf();
								return;
								
								}
								
			case "4":
				ArrayList<String> sub_gnome = new ArrayList<>();
				
							System.out.println("\nCerto, temos duas sub-raças dos Gnomos, que são:");
			
				sub_gnome.add(" Gnomo da Floresta");
				sub_gnome.add(" Gnomo das Rochas");

				for (int i = 0; i < sub_gnome.size(); i++) {
					System.out.println((i + 1) + ". " + sub_gnome.get(i));
					
				}
			
							System.out.println("Informe com qual você sub-raça dos Gnomos você deseja jogar:");
			
								Scanner enter_sub_gnome = new Scanner(System.in);
								int sub_gnome_player = enter_sub_gnome.nextInt();
									
								switch(sub_gnome_player) {
								
								case 1:
									System.out.println("\nCerto, seu personagem será um: "+sub_gnome_player+". Agora vamos prosseguir para as classes.");
									return;
									
								case 2:
									System.out.println("\nCerto, seu personagem será um: "+sub_gnome_player+". Agora vamos prosseguir para as classes.");
									return;
									
							default:
								System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
								menu_races_gnome();
								return;
								
								}
			case "5":
				ArrayList<String> sub_halfling = new ArrayList<>();
				
							System.out.println("\nCerto, temos duas sub-raças dos Halflings, que são:");
			
				sub_halfling.add(" Robusto");
				sub_halfling.add(" Pés Peludos");

				for (int i = 0; i < sub_halfling.size(); i++) {
					System.out.println((i + 1) + ". " + sub_halfling.get(i));
					
				}
			
							System.out.println("Informe com qual você sub-raça dos Halflings você deseja jogar:");
			
								Scanner enter_sub_halfling = new Scanner(System.in);
								int sub_halfling_player = enter_sub_halfling.nextInt();
								
								switch(sub_halfling_player) {
								
								case 1:
									System.out.println("\nCerto, seu personagem será um: "+sub_halfling_player+". Agora vamos prosseguir para as classes.");
									return;
									
								case 2:
									System.out.println("\nCerto, seu personagem será um: "+sub_halfling_player+". Agora vamos prosseguir para as classes.");
									return;
									
							default:
								System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
								menu_races_halfling();
								return;
								
								}
								
								case "6":
									System.out.println("\nCerto, seu personagem será um: "+races_player+". Agora vamos prosseguir para as classes.");
									break;
									
								case "7":
									System.out.println("\nCerto, seu personagem será um: "+races_player+". Agora vamos prosseguir para as classes.");
									break;
									
								case "8":
									System.out.println("\nCerto, seu personagem será um: "+races_player+". Agora vamos prosseguir para as classes.");
									break;
									
								case "9":
									System.out.println("\nCerto, seu personagem será um: "+races_player+". Agora vamos prosseguir para as classes.");
									break;
									
									default:
									System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
									
									menu_races();
								}	
		

}

//Método Menu de Classes

private static void menu_classes() {

//Método para Classes	
	
	Scanner enter_classes = new Scanner(System.in);
	int classes_player = enter_classes.nextInt();
	
	switch(classes_player) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		break;
	case 6:
		break;
	case 7:
		break;
	case 8:
		break;
	case 9:
		break;
	case 10:
		break;
	case 11:
		break;
	case 12:
		break;
	case 13:
		break;
			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
									menu_classes();
	}
	
}

//Método Menu de Antecedentes

private static void menu_backgrounds() {

//Método para Antecedentes	
	
	Scanner enter_backgrounds = new Scanner(System.in);
	int backgrounds_player = enter_backgrounds.nextInt();
	
	switch(backgrounds_player) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		break;
	case 6:
		break;
	case 7:
		break;
	case 8:
		break;
	case 9:
		break;
	case 10:
		break;
	case 11:
		break;
	case 12:
		break;
	case 13:
		break;
	case 14:
		break;
			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
									menu_backgrounds();
	}
	
}

//Método Menu de Alinhamentos

private static void menu_alignments() {

//Método para Tendências:	
	
	Scanner enter_alignment = new Scanner(System.in);
	int alignment_player = enter_alignment.nextInt();
	
	switch(alignment_player) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		break;
	case 6:
		break;
	case 7:
		break;
	case 8:
		break;
	case 9:
		break;
			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
									menu_alignments();
}
}

//Métodos de Preenchimento de Informações da Ficha do Player

/*private static void Dices_WorkQuest(){


	
	for (int x = 0; x<1; x++) {
		System.out.println("Seu número no D04 é: " + new Dices_WorkQuest().roll_d04());
			
		}
	
	roll_d04();
	
	for (int x = 0; x<1; x++) {
		System.out.println("Seu número no D06 é: " + new Dices_WorkQuest().roll_d06());
			
		}
	
	roll_d06();
	
	for (int x = 0; x<1; x++) {
		System.out.println("Seu número no D08 é: " + new Dices_WorkQuest().roll_d08());
	}
	
	roll_d08();
	
	for (int x = 0; x<1; x++) {
		System.out.println("Seu número no D10 é: " + new Dices_WorkQuest().roll_d10());
	}
	
	roll_d10();
	
	for (int x = 0; x<1; x++) {
		System.out.println("Seu número no D12 é: " + new Dices_WorkQuest().roll_d12());
	}

	roll_d12();

	for (int x = 0; x<1; x++) {
		System.out.println("Seu número no D20 é: " + new Dices_WorkQuest().roll_d20());
	}

	roll_d20();

	}
*/
//Menu das Sub-Raças

private static void menu_races_dwarf() {
	
	Scanner enter_sub_dwarf = new Scanner(System.in);
	String sub_dwarf_player = enter_sub_dwarf.nextLine();
	
	switch(sub_dwarf_player) {

case "Anão da Colina":
	System.out.println("\nCerto, seu personagem será um: "+sub_dwarf_player+". Agora vamos prosseguir para as classes.");
	break;
	
case "Anão da Montanha":
	System.out.println("\nCerto, seu personagem será um: "+sub_dwarf_player+". Agora vamos prosseguir para as classes.");
	break;
	
default:
	System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
	menu_races_dwarf();
}
}

private static void menu_races_dragonborn() {
	
	Scanner enter_sub_dragonborn = new Scanner(System.in);
	String sub_dragonborn_player = enter_sub_dragonborn.nextLine();
	
	switch(sub_dragonborn_player) {
		
	case "Azul":
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Branco":
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Bronze":
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Cobre":
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Latão":
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Negro":
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Ouro":	
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Prata":
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Verde":
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Vermelho":	
		System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as classes.");
		break;
		
	default:
		System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
		menu_races_dragonborn();
	}
	
}

private static void menu_races_elf() {
	
	Scanner enter_sub_elf = new Scanner(System.in);
	String sub_elf_player = enter_sub_elf.nextLine();
	
	switch(sub_elf_player) {
		
	case "Alto Elfo":
		System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as classes.");
		break;
	
	case "Elfo da Floresta":
		System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as classes.");
		break;
		
	case "Elfo Negro":
		System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as classes.");
		break;
		
	default:
		System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
		menu_races_elf();
}
}

private static void menu_races_gnome() {
	Scanner enter_sub_gnome = new Scanner(System.in);
	String sub_gnome_player = enter_sub_gnome.nextLine();
	
	switch(sub_gnome_player) {
		
	case "Gnomo da Floresta":
		System.out.println("\nCerto, seu personagem será um: "+sub_gnome_player+". Agora vamos prosseguir para as classes.");
		break;
	
	case "Gnomo das Rochas":
		System.out.println("\nCerto, seu personagem será um: "+sub_gnome_player+". Agora vamos prosseguir para as classes.");
		break;
		
	default:
		System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
		menu_races_gnome();
}	
}

private static void menu_races_halfling() {
	Scanner enter_sub_halfling = new Scanner(System.in);
	String sub_halfling_player = enter_sub_halfling.nextLine();
	
	switch(sub_halfling_player) {
		
	case "Robustos":
		System.out.println("\nCerto, seu personagem será um: "+sub_halfling_player+". Agora vamos prosseguir para as classes.");
		break;
	
	case "Pés Peludos":
		System.out.println("\nCerto, seu personagem será um: "+sub_halfling_player+". Agora vamos prosseguir para as classes.");
		break;
		
	default:
		System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
		menu_races_halfling();
}	
}

//Rolar os Dados
	
public static int roll_d04() {

		// D04 de RPG

				double d04 = (int)((Math.random()*4));
									
			// Parâmetros de Jogar o D04
									
									if(d04>0 && d04 <= 4/4*1) {
											return 1;
									
									}else if(d04> 4/4*1 && d04 <= 4/4*2) {
											return 2;
									
									}else if(d04> 4/4*2 && d04 <= 4/4*3) {
											return 3;
									}else {
											return 4;
									}
	}

public static int roll_d06() {


	// D06 de RPG

				double d06 = (int)((Math.random()*6));									
	
//Método de Jogar o D06
						
						if(d06>0 && d06 <= 6/6*1) {
								return 1;
						
						}else if(d06> 6/6*1 && d06 <= 6/6*2) {
								return 2;
						
						}else if(d06> 6/6*2 && d06 <= 6/6*3) {
								return 3;
								
						}else if(d06> 6/6*3 && d06 <= 6/6*4) {
								return 4;
								
						}else if(d06> 6/6*4 && d06 <= 6/6*5) {
								return 5;
							
						}else{
								return 6;


}
}
	
public static int roll_d08() {
	
	// D08 de RPG

		double d08 = (int)((Math.random()*8));									

	//Método de Jogar o D08
				
				if(d08>0 && d08 <= 8/8*1) {
						return 1;
				
				}else if(d08> 8/8*1 && d08 <= 8/8*2) {
						return 2;
				
				}else if(d08> 8/8*2 && d08 <= 8/8*3) {
						return 3;
						
				}else if(d08> 8/8*3 && d08 <= 8/8*4) {
						return 4;
						
				}else if(d08> 8/8*4 && d08 <= 8/8*5) {
						return 5;
						
				}else if(d08> 8/8*5 && d08 <= 8/8*6) {
						return 6;
				
				}else if(d08> 8/8*6 && d08 <= 8/8*7) {
						return 7;
					
				}else{
					return 8;

	}
}

public static int roll_d10() {
	
	// D10 de RPG

			double d10 = (int)((Math.random()*10));									

		//Método de Jogar o D10
					
					if(d10>0 && d10 <= 10/10*1) {
							return 1;
					
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
					
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
							
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
							
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
							
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
					
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
						
					}else{
						return 10;


		}
	
}

public static int roll_d12() {
	
	// D12 de RPG

	double d12 = (int)((Math.random()*12));									

//Método de Jogar o D12
			
			if(d12>0 && d12 <= 12/12*1) {
					return 1;
			
			}else if(d12> 12/12*1 && d12 <= 12/12*2) {
					return 2;
			
			}else if(d12> 12/12*2 && d12 <= 12/12*3) {
					return 3;
					
			}else if(d12> 12/12*3 && d12 <= 12/12*4) {
					return 4;
					
			}else if(d12> 12/12*4 && d12 <= 12/12*5) {
					return 5;
					
			}else if(d12> 12/12*5 && d12 <= 12/12*6) {
					return 6;
			
			}else if(d12> 12/12*6 && d12 <= 12/12*7) {
					return 7;
			
			}else if(d12> 12/12*7 && d12 <= 12/12*8) {
					return 8;
			
			}else if(d12> 12/12*8 && d12 <= 12/12*9) {
					return 9;
					
			}else if(d12> 12/12*9 && d12 <= 12/12*10) {
					return 10;
					
			}else if(d12> 12/12*10 && d12 <= 12/12*11) {
					return 11;
					
			}else {
					return 12;
}
	
}

public static int roll_d20() {

	// D20 de RPG

	double d20 = (int)((Math.random()*20));									

//Método de Jogar o D20
			
			if(d20>0 && d20 <= 20/20*1) {
					return 1;
			
			}else if(d20> 20/20*1 && d20 <= 20/20*2) {
					return 2;
			
			}else if(d20> 20/20*2 && d20 <= 20/20*3) {
					return 3;
					
			}else if(d20> 20/20*3 && d20 <= 20/20*4) {
					return 4;
					
			}else if(d20> 20/20*4 && d20 <= 20/20*5) {
					return 5;
					
			}else if(d20> 20/20*5 && d20 <= 20/20*6) {
					return 6;
			
			}else if(d20> 20/20*6 && d20 <= 20/20*7) {
					return 7;
			
			}else if(d20> 20/20*7 && d20 <= 20/20*8) {
					return 8;
			
			}else if(d20> 20/20*8 && d20 <= 20/20*9) {
					return 9;
					
			}else if(d20> 20/20*9 && d20 <= 20/20*10) {
					return 10;
					
			}else if(d20> 20/20*10 && d20 <= 20/20*11) {
					return 11;
					
			}else if(d20> 20/20*11 && d20 <= 20/20*12) {
					return 12;
			
			}else if(d20> 20/20*12 && d20 <= 20/20*13) {
					return 13;
					
			}else if(d20> 20/20*13 && d20 <= 20/20*14) {
					return 14;
			
			}else if(d20> 20/20*14 && d20 <= 20/20*15) {
					return 15;
					
			}else if(d20> 20/20*15 && d20 <= 20/20*16) {
					return 16;
				
			}else if(d20> 20/20*16 && d20 <= 20/20*17) {
					return 17;
				
			}else if(d20> 20/20*17 && d20 <= 20/20*18) {
					return 18;
					
			}else if(d20> 20/20*18 && d20 <= 20/20*19) {
					return 19;
				
			}else {	
					return 20;

}
	
}

//Sistema de Atributos

/*public static void system_add_atributes() {

//Método de Sistema de Preenchimento de Atributos	
	
	Scanner system_atributes = new Scanner(System.in);
	int enter_system_atributes = system_atributes.nextInt();
	
	// Sistemas de Atributos
	
		if(enter_system_atributes == 1) {
			
			// Força
			
			System.out.println("\nCerto, como foi dito previamente, temos "+atribute_points+" pontos para distribuir para seus atributos.\n");
			System.out.println("Digite quantos pontos você deseja pôr em Força:");
			
			Scanner enter_strength_atribute = new Scanner(System.in);
			int strength_atribute = enter_strength_atribute.nextInt();
			atribute_points = atribute_points - strength_atribute;
			System.out.println(atribute_points);
			//minus_atributes(atribute_points, strength_atribute);
			
			// Destreza
			
			System.out.println("Digite quantos pontos você deseja pôr em Destreza:");
			
			Scanner enter_dexterity_atribute = new Scanner(System.in);
			int dexterity_atribute = enter_dexterity_atribute.nextInt();	
			atribute_points = atribute_points - dexterity_atribute;
			System.out.println(atribute_points);
			
			// Constituição
			
			System.out.println("Digite quantos pontos você deseja pôr em Constituição:");
			
			Scanner enter_constitution_atribute = new Scanner(System.in);
			int constitution_atribute = enter_constitution_atribute.nextInt();
			atribute_points = atribute_points - constitution_atribute;
			
			// Inteligência
			
			System.out.println("Digite quantos pontos você deseja pôr em Inteligência:");
			
			Scanner enter_intelligence_atribute = new Scanner(System.in);
			int intelligence_atribute = enter_intelligence_atribute.nextInt();
			atribute_points = atribute_points

			
			// Sabedoria
			
			System.out.println("Digite quantos pontos você deseja pôr em Sabedoria:");
			
			Scanner enter_wisdom_atribute = new Scanner(System.in);
			int wisdom_atribute = enter_wisdom_atribute.nextInt();
			
			// Carisma
			
			System.out.println("Digite quantos pontos você deseja pôr em Carisma:");
			
			Scanner enter_charisma_atribute = new Scanner(System.in);
			int charisma_atribute = enter_charisma_atribute.nextInt();
				
		} else if (enter_system_atributes == 2) {
		
	
		} if ((enter_system_atributes > 2) || (enter_system_atributes < 1)) {
		
		System.out.println("\nOpção inválida, por favor digite qual sistema de preenchimento de atributos você deseja utilizar:");
		
		system_add_atributes();
		
		}
}
*/
/*public static void minus_atributes(int in_atribute_points, int strength_atribute) {
	
	atribute_points = in_atribute_points - strength_atribute;
	System.out.println(atribute_points);
	
	// = in_atribute_points - dexterity_atribute;
	//System.out.println(atribute_points);
	
}

//Sistema de Modificadores de Atributos

public static void list_mod_str() {
	
}

public static void list_mod_dex() {
	
}

public static void list_mod_con() {
	
}

public static void list_mod_int() {
	
}

public static void list_mod_wis() {
	
}

public static void list_mod_cha() {
	
}

//Método de Sistema de Preenchimento de Perícias

public static void system_add_skill() {
	
	
	
	
}
*/
	

}

	