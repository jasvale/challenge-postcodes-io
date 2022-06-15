# Interview Challenge Postcodes.io #
Delivered for an technical interview, this project was developed in Java & Spring along with Thymeleaf & Boostrap. 

### Functionailities & Requeriments
Given a list of a UK postcodes:

| Index    | Postcode |
|----------|----------|
| #1       | N76RS    |
| #2       | SW46TA   |
| #3       | SW1A     |
| #4       | W1B3AG   |
| #5       | PO63TD   |

Build an web application that:
- Allows you to find the addresses of our customers based on their postcodes.
- Have the history of the last 3 postcodes searched in the page.
- Alongside the address, display the distance in a straight line, from the customer location to London Heathrow airport (lat/long: 51.4700223,-0.4542955), both in KM and in Miles.
- Use https://postcodes.io/ to search data for each postcode. 

 A working example for the web service is: http://api.postcodes.io/postcodes/N76RS, which returns:
```json
{
  "status": 200,
  "result": {
    "postcode": "N7 6RS",
    "quality": 1,
    "eastings": 530640,
    "northings": 186295,
    "country": "England",
    "nhs_ha": "London",
    "longitude": -0.116805,
    "latitude": 51.560414,
    "european_electoral_region": "London",
    "primary_care_trust": "Islington",
    "region": "London",
    "lsoa": "Islington 007B",
    "msoa": "Islington 007",
    "incode": "6RS",
    "outcode": "N7",
    "parliamentary_constituency": "Islington North",
    "admin_district": "Islington",
    "parish": "Islington, unparished area",
    "admin_county": null,
    "admin_ward": "Finsbury Park",
    "ced": null,
    "ccg": "NHS North Central London",
    "nuts": "Haringey and Islington",
    "codes": {
      "admin_district": "E09000019",
      "admin_county": "E99999999",
      "admin_ward": "E05000371",
      "parish": "E43000209",
      "parliamentary_constituency": "E14000763",
      "ccg": "E38000240",
      "ccg_id": "93C",
      "ced": "E99999999",
      "nuts": "TLI43",
      "lsoa": "E01002731",
      "msoa": "E02000560",
      "lau2": "E09000019"
    }
  }
}
```