## Virtual Pets API!
Oh noes! Your virtual pet amok data needs to be organized.

The original values of the functions previously carried out need to be stored in a database and retrieve for the beginnings of a graphical user interface or GUI.

It will be necessary for our virtual pet api application to store all data from virtul pet amok for all pets, both organic and robotic, on the initial startup of the application.

Furthermore, this application will be established to represent all the shelters and their pets within the city, in which there are multiple.

## Required Tasks

### Backend
- Choose which student’s virtual pet will be used for this project.
- Use the Virtual Pet classes from Virtual Pet Amok as your model. This will probably require substantial modifications, that’s what the team is for!
- Relate Shelter to Virtual Pet. Allow for more than one shelter, though you still only need one shelter unless you want to get fancy.
- Make appropriate repos for your model.
- Make controller endpoints that can do everything your original pets did in Amok. For instance, make an endpoint that will feed all your pets. Make sure you still tick() when you should!

### Frontend
- Create a frontend that has the following pages:
    - Shelter view which shows the names and basic stats of a pet. Also should allow you to adopt pets out and call appropriate shelter methods.
    - Pet view which shows a pet in detail. Also should be capable of running any pet specific methods you have.
  - Add pet view which allows you to add a new pet. Feel free to incorporate this one directly into the shelter view or pet view if you think it looks better.
- Use CSS styling and keep a consistent styling throughout the frontend.
- Use Javascript to interact with your back end.

### General

You will use the VS Code REST Client extension to test mappings

You must include values for Virtual Pet Amok for all pets in your populator class that will insert data to be retrieved ex. hungerLevel, oilLevel

TDD is to be done for your controllers only

Make your pets tick in real time: Make it so that rather than calling tick() every time you interact with your shelter, tick() gets called every few seconds and updates the view.
 
 You will have multiple Shelters and address, phone number, contact person



### ​All classes
Encapsulate all instance variables.

All instance variables for Virtual Pet Amok will be resused

Convert the following instance variables to boolean
1. walk a dogs
2. clean a dog’s cage
3. clean a cat’s litterbox
4. oil a robotic pet
5. Charge batteries of robotic pet 

 

Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.

​VirtualPetApiApplication class and related subclasses/interfaces
In addition to the last project’s requirements:

Create a MappedSuperclass for VirtualPet. Please see the following link 2. MappedSuperClass on how to use @MappedSuperclass annotation (https://www.baeldung.com/hibernate-inheritance to an external site.). All other method functions should be as your VirtualPet Amok VirtualPet class

Create a sub-models of organic pets, robotic pets, and for dogs, cats for both organic and robotic pets

Create a model for shelter and volunteer

In addition to creating a volunteer model, include the following attributes: name, collection of shelters

Create the following relationships between your models:

### One to Many
shelter → dogs
shelter → cats
shelter → robotic dogs
shelter → robotic cats

### Many to Many
shelter → volunteer

Create repositories for all models
Create controller classes for all models
Create get mappings for all the functions previously utilized in VirtualPet Amok

Remember that you **DO NOT** have to code functionality that deals with all or individual pets ex. **feedAllPets()** or **feedPet()**

Must provide get mappings to retrieve pets, shelters, and volunteers by name

Create post mapping for volunteer that will be provided that will populate the volunteer model.


### ​Tips
Remember to code one model and it’s components at a time
All API requests are to be done using the VS Code REST Client

### ​Grading
All aforementioned requirements will be graded

### Stretch Tasks
Animation: Add Javascript animations to the view.

Use your creativity: If you think of something and have extra time, feel free to attempt it!
