export class Jogo {
  public id!: number;
  public nome!: string;
  public descricao!: string;
  public imagem!: string;
  public preco!: number;
  public esta_favoritado!: boolean;

  constructor(id: number, nome: string, descricao: string, imagem: string, preco: number, esta_favoritado: boolean) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.imagem = imagem;
    this.preco = preco;
    this.esta_favoritado = esta_favoritado;
  }
}
