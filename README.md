# rki-plz-api
REST API for the PLZ-Tool of the RKI.

# Documentation

The swagger ui is hosted on Port 6780.

# Example

```
GET /authority?plz=89343
```

Response:
```json
[
    {
        "searchText": [
            {
                "value": "86381"
            }
        ],
        "name": "Landratsamt Günzburg",
        "code": "1.09.7.74.",
        "department": "Gesundheitsamt",
        "street": "An der Kapuzinermauer 1",
        "postalCode": "89312",
        "place": "Günzburg",
        "phone": "+49 8221 95-722",
        "fax": "+49 8221 95-770",
        "email": "Gesundheitsamt@landkreis-guenzburg.de",
        "covid19Hotline": "",
        "covid19Email": "Corona@landkreis-guenzburg.de",
        "covid19Fax": "+49 8221 95 6718",
        "einreiseAnmeldungHotline": "",
        "einreiseAnmeldungEmail": "Corona@landkreis-guenzburg.de",
        "einreiseAnmeldungFax": ""
    }
]
```
