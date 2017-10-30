package org.inaturalist.android;

/** General utility functions for handling iNat places */
public class PlaceUtils {
    /** Converts a place type to a string resource representing it */
    public static int placeTypeToStringResource(int placeType) {
        switch (placeType) {
            case 0:
                return R.string.undefined;
            case 2:
                return R.string.street_segment;
            case 5:
                return R.string.intersection;
            case 6:
                return R.string.street;
            case 7:
                return R.string.town;
            case 8:
                return R.string.state;
            case 9:
                return R.string.county;
            case 10:
                return R.string.local_administrative_area;
            case 12:
                return R.string.country;
            case 13:
                return R.string.island;
            case 14:
                return R.string.airport;
            case 15:
                return R.string.drainage;
            case 16:
                return R.string.land_feature;
            case 17:
                return R.string.miscellaneous;
            case 18:
                return R.string.nationality;
            case 19:
                return R.string.supername;
            case 20:
                return R.string.point_of_interest;
            case 21:
                return R.string.region;
            case 24:
                return R.string.colloquial;
            case 25:
                return R.string.zone;
            case 26:
                return R.string.historical_state;
            case 27:
                return R.string.historical_county;
            case 29:
                return R.string.continent;
            case 33:
                return R.string.estate;
            case 35:
                return R.string.historical_town;
            case 36:
                return R.string.aggregate;
            case 100:
                return R.string.open_space;
            case 101:
                return R.string.territory;
            case 102:
                return R.string.district;
            case 103:
                return R.string.province;
            case 1000:
                return R.string.municipality;
            case 1001:
                return R.string.parish;
            case 1002:
                return R.string.department_segment;
            case 1003:
                return R.string.city_building;
            case 1004:
                return R.string.commune;
            case 1005:
                return R.string.governorate;
            case 1006:
                return R.string.prefecture;
            case 1007:
                return R.string.canton;
            case 1008:
                return R.string.republic;
            case 1009:
                return R.string.division;
            case 1010:
                return R.string.subdivision;
            case 1011:
                return R.string.village_block;
            case 1012:
                return R.string.sum;
            case 1013:
                return R.string.unknown;
            case 1014:
                return R.string.shire;
            case 1015:
                return R.string.prefecture_city;
            case 1016:
                return R.string.regency;
            case 1017:
                return R.string.constituency;
            case 1018:
                return R.string.local_authority;
            case 1019:
                return R.string.poblacion;
            case 1020:
                return R.string.delegation;
            default:
                return R.string.unknown;
        }
    }
}
