# Description
Animals in the ASCII land desperately need your help in getting that crooked mirror straight — lend them a hand. That will be the end of your journey.

```
{modified line} | {reversed modified line}
```
reversed modified line is a modified line printed backward. Replace the characters that are not horizontally symmetrical with their horizontally-opposite chars: < to >, [ to ], { to }, ( to ), / to \, and vice versa.

# Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

File hierarchy for these examples:

```
ASCII_Animals/
├── MooFolder/
│   ├── Cow.txt
├── MeowFolder/
├── HumphFolder/
│   ├── Camel.txt
```
### Example 1:

```
Input the file path:
> C:\ASCII_Animals\MooFolder\Cow.txt
            ^__^ | ^__^
    _______/(oo) | (oo)\_______
/\/(       /(__) | (__)\       )\/\
   | w----||     |     ||----w |
   ||     ||     |     ||     ||
```
### Example 2:

```
Input the file path:
> C:\ASCII_Animals\HumphFolder\Camel.txt
   //            |            \\
 _oo\            |            /oo_
(__/ \  _  _     |     _  _  / \__)
   \  \/ \/ \    |    / \/ \/  /
   (         )\  |  /(         )
    \_______/  \ | /  \_______/
     [[] [[]     |     []] []]
     [[] [[]     |     []] []]
```
### Example 3:

```
Input the file path:
> C:\ASCII_Animals\MeowFolder\Cat.txt
File not found!
```
### Example 4:

```
Input the file path:
> C:\ASCII_Animals\MooFolder
File not found!
```
