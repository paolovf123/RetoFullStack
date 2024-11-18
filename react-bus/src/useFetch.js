import React from "react";
function useFetch(url){
    const [buses,setBuses]= React.useState([]);
    const [loading, setLoading] = React.useState(true);
    React.useEffect(()=>{
        setLoading(true);
        fetch(url)
        .then((Response)=>Response.json())
        .then((buses)=>setBuses(buses))
        .finally(()=>setLoading(false));
    },[]);


    return{buses,loading};
}
export {useFetch};