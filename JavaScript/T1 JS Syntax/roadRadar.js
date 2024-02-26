/* 11.	Road Radar
Write a function that determines whether a driver is within the speed limit. 
You will receive the speed and the area. Each area has a different limit: 
•	On the motorway, the limit is 130 km/h
•	On the interstate, the limit is 90 km/h
•	In the city, the limit is 50 km/h 
•	Within a residential area, the limit is 20 km/h
If the driver is within the limits, there should be a printed speed and the speed limit. 
                `Driving {speed} km/h in a {speed limit} zone`
If the driver is over the limit, however, your function should print the severity of the infraction and the difference in speeds. 
`The speed is {difference} km/h faster than the allowed speed of {speed limit} - {status}`
For speeding up to 20 km/h over the limit, the status should be speeding.
For speeding up to 40 km/h over the limit, the status should be excessive speeding.
For anything else, status should be reckless driving.
The input comes as 2 string parameters. The first element is the current speed (number), the second element is the area.
The output should be printed on the console.
Examples
Input	Output
40, 'city'	        Driving 40 km/h in a 50 zone
21, 'residential'	The speed is 1 km/h faster than the allowed speed of 20 - speeding
120, 'interstate'	The speed is 30 km/h faster than the allowed speed of 90 - excessive speeding
200, 'motorway'	    The speed is 70 km/h faster than the allowed speed of 130 - reckless driving
 */
function roadRadar(speed, area) {
    let limit = 0;
    let msg = "";
    switch (area) {
        case "motorway":
            limit = 130;
            break;
        case "interstate":
            limit = 90;
            break;
        case "city":
            limit = 50;
            break;
        case "residential":
            limit = 20;
            break;
    }
    if (speed > limit) {
        let status = "";
        let difference = speed - limit;
        if (difference < 21) {
            status = "speeding"
        }
        else if (difference < 41) {
            status = "excessive speeding"
        }
        else {
            status = "reckless driving"
        }
        msg = `The speed is ${difference} km/h faster than the allowed speed of ${limit} - ${status}`
    }
    else {
        msg = `Driving ${speed} km/h in a ${limit} zone`;
    }
    console.log(msg);
}