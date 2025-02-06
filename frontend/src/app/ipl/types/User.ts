<<<<<<< HEAD

export class User {
userId:number;
fullName:string;
username:string;
password:string;
email:string;
role:string;
constructor(userId:number,
    fullName:string,
    username:string,
    password:string,
    email:string,
    role:string){
        this.userId=userId;
this.fullName=fullName;
this.username=username;
this.password =password;
this.email=email;
this.role = role;
    }
    displayInfo(){
        console.log(`user ID: ${this.userId}`);
        console.log(`Full Name: ${this.fullName}`);
        console.log(`Email: ${this.email}`);
    }
=======
export class User {
   
    userId:number;
    fullName:string;
    username:string;
    password:string;
    email:string;
    role:string;
   
 
 
    constructor(   userId:number,
        fullName:string,
        username:string,
        password:string,
        email:string,
        role:string){
        this.userId=userId;
          this.fullName=fullName;
          this.username=username;
          this.password=password;
          this.email=email;
          this.role=role;
 
         
      }
 
      displayInfo(){
          console.log(`User ID: ${this.userId}`);
          console.log(`Full Name: ${this.fullName}`);
          console.log(`Email: ${this.email}`);
      }
 
 
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
}