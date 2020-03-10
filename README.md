# CMC
CS230 project by group Thumb Thumbs at SJU.
# Authors
[Alex Morales-Garcia](https://github.com/amoralesg001), [Carter Huberty](https://github.com/chuberty001), [John Engh](https://github.com/bluebous), [Jack Young](https://github.com/jyoung001), [Nick Larson](https://github.com/nlarson002), and [Readyson Vang](https://github.com/readysonvang).
# Use Cases
## U1: Login
> Created by Alex
### Name: 
U1: Login
### Actors:
Customer(Admin or User)
### Triggers:
Customer goes to website
### Preconditions:
User must be registered
### Events:
1. User enters credentials  
   1. Username entered
   2. Password enterd
2. User clicks "login"
### Post-conditions:
 1. User is brought to home page
 2. User is logged in and authenticated
### Alternate:
 1. User has invalid Username and/or Password
    1. Screen displayed
 2. User can re-enter password
## U2: List Saved Schools
> Created by Alex
### Name: 
U2: List Saved Schools (Extends U1)
### Actors:
User (Primary)
### Triggers:
User clicks on "manage saved schools" from home page
### Preconditions:
1. User is not admin
2. user is logged in
### Events:
1. user clicks "Manage Saved Schools"
2. User is brought to "Manage Saved Schools"
### Post-conditions:
1. User is brought to "Manage Saved Schools" page
### Alternate:
N/a
## U3: Manage Profile
> Created by John
### Name: 
U3: Manage profile (Extends U1)
### Actors:
User (Admin or User) (Primary)
### Triggers:
User clicks manage profile button on home screen
### Preconditions:
User is logged in
### Events:
1.	User clicks manage profile button on home screen
2.	Manage profile screen is displayed
### Post-conditions:
Manage profile screen is displayed
### Alternate:
N/A
## U4: Search for Schools
> Created by John
### Name: 
U4: Search for Schools (Extends U1, U11)
### Actors:
User (Admin or User) (Primary)
### Trigger:
User chooses search for school button
### Preconditions:
user is logged in; Search box populated
### Events:
1.	User chooses search option from home screen
2.	User types query into search box
3.	User presses search button
4.	Include U8: View Search Results 
### Post-conditions:
User is shown search page relating to search query
### Alternate:
1.	User presses search button without entering query
    1.	User is prompted to enter query and continues with step 3
Post-conditions: none
## U5: View Individual School
> Created by Jack
### Name: 
U5: View Individual School (Extends U2, U8)
### Actors:
User (Admin || User) (Primary)
### Triggers:
1.	User clicks on a specific school that they wish to view individually from the search results page.
2.	User clicks on a specific school that they wish to view individually from the manage saved schools page.
### Preconditions:
1.	User is logged in.
2.	User is either viewing search results (U8) or managing saved schools (U2).
### Events:
1.	User clicks on the school that they wish to view individually.
2.	Brings user to a page displaying all the school's individual statistics and information.
### Post-conditions:
User is shown a page displaying all the school's individual statistics and information.
### Alternate:
N/A
## U6: Remove Schools from List
> Created by Jack
### Name: 
U6: Remove School from List (Extends U2)
### Actors:
User (Primary)
### Triggers:
 User clicks on “Remove School” Button
### Preconditions:
1. User is logged in.
2. User is managing saved schools (U2).
3. School they want to remove is in their saved school list.
### Events:
1. User selects the ‘remove’ option next to a school in the manage schools page.
2. The selected school is removed from the list.
3. User stays on the manage schools page and continues to manage schools.
### Post-conditions:
1.	School is removed from the list.
2.	User continues managing saved schools.
### Alternate:
N/A
## U7: Edit User Information
> Created by Nick
### Name: 
U7: Edit User Information (Extends U3)
### Actors:
User (Admin || User) (Primary)
### Triggers:
User clicks on box with information they want to edit
### Preconditions:
1.	User is logged in
2.	Information they want to edit is not user type or username
### Events:
1.	User clicks on box relating to information they would like to edit
2.	Information box allows user to type new information relating to what they would like to change
3.	User clicks save button
4.	Information is now changed and saved successfully 
### Post-conditions:
User has changed and saved information
### Alternate:
1.	User updates information but does not save before leaving
    1.	Information is not saved

Postconditions: User is brought back to main menu

## U8: View Search Results
> Created by Carter
### Name: 

### Actors:

### Triggers:

### Preconditions:

### Events:

### Post-conditions:

### Alternate:

## U9: Save School to List
> Created by Carter
### Name: U9: 
Save School to List (Extends U5, U8) 
### Actors: 
User (Primary) 
### Triggers: 
User Clicks “Save” Button 
### Preconditions: 
User is logged in 
### Events:
1. User is doing U8: View Search Results 
    1. User Clicks Save School
    2. User is notified the school is saved
2. User is doing U5: View Individual School  
    1. User Clicks Save School
    2. User is notified the school is saved
### Post-conditions: 
School is Saved to the List 
### Alternate:
1. School is already in Saved Schools List 
    1. User is notified the school is already in the list 
    2. Post-Condition: None
## U10: Manage Users
### Name: 
U10: Manage Users. (Extends U1: Login) 
### Actors:
Admin (Primary) 
### Triggers:
Admin clicks Manage Users button 
### Preconditions:
1. User must be admin 
2. User must be logged in 
### Events:
1. User clicks on Manage Users 
2. User is brought to page to view users 
### Post-conditions:
User is brought to Manage Users page  
### Alternate:
N/A 
## U11: Manage Universities
### Name: 

### Actors:

### Triggers:

### Preconditions:

### Events:

### Post-conditions:

### Alternate:

## U12: Add University
> Created by Readyson
### Name: 

### Actors:

### Triggers:

### Preconditions:

### Events:

### Post-conditions:

### Alternate:

## U13: Logout
> Created by Readyson
### Name: 

### Actors:

### Triggers:

### Preconditions:

### Events:

### Post-conditions:

### Alternate:

## U14: Add User
### Name: 

### Actors:

### Triggers:

### Preconditions:

### Events:

### Post-conditions:

### Alternate:

## U15: Edit User
### Name: 

### Actors:

### Triggers:

### Preconditions:

### Events:

### Post-conditions:

### Alternate:

## U16: Edit University Information
### Name: 

### Actors:

### Triggers:

### Preconditions:

### Events:

### Post-conditions:

### Alternate:

## U17: Blacklist University
> Created by Nick
### Name: 

### Actors:

### Triggers:

### Preconditions:

### Events:

### Post-conditions:

### Alternate:

