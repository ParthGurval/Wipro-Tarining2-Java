

function monthOfYear (month)
{
    switch (month) {
        case 1:
            console.log(`Value of ${month} is:- January`);
            break;

        case 2:
            console.log(`Value of ${month} is:- Febuary`);
            break;

        case 3:
            console.log(`Value of ${month} is:- March`);
            break; 

        case 4:
            console.log(`Value of ${month} is:- April`);
            break;

        case 5:
            console.log(`Value of ${month} is:- May`);
            break;

        case 6:
            console.log(`Value of ${month} is:- June`);
            break;

        case 7:
            console.log(`Value of ${month} is:- July`);
            break;

        case 8:
            console.log(`Value of ${month} is:- August`);
            break;

        case 9:
            console.log(`Value of ${month} is:- September`);
            break;
        
        case 10:
            console.log(`Value of ${month} is:- October`);
            break; 
                
        case 11:
            console.log(`Value of ${month} is:- November`);
            break; 
            
        case 12:
            console.log(`Value of ${month} is:- December`);
            break;

        default:
            console.log(`${month} Is a Invalid Input --> Please provide the correct input value`);
            break;
    }

    console.log(`--------------------------------------------------------------------------`);
}

monthOfYear(0);
monthOfYear(2);
monthOfYear(5);
monthOfYear(12);
monthOfYear(15);
monthOfYear(100);
monthOfYear(null);
monthOfYear(undefined);
monthOfYear(true);