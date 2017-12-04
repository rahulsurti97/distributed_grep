# ECE428 - MP1

This is our implementation of a distributed `grep` system.
### How to Start
- Clone the repo using `git clone`
- `cd` into the scripts folder
- You can run the server by typing `./start_server.sh`
- You can run the client by typing `./start_client.sh`

### Description
This program will `grep` the VM logs that were provided in the [piazza post](https://piazza.com/class/j62jpvac34n5gi?cid=94).
An example input would be `grep GET`.
This will run grep on _all_ the VMx.log files where x is the VM number.
